
package logica.LogicaTramite;
import logica.*;

public class Administrador {
    private String usuario;
    private String contrasena;
    private static Administrador instancia;

    private Administrador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
     public static Administrador getInstance() {
        if (instancia == null) {
            instancia = new Administrador("admin","admin");
        }
        return instancia;
    }
    
    

    public void crearDependencia(Gestion_Tramite sistema, String nomdep) {
        Dependencia nueva = new Dependencia(nomdep);
        sistema.getDepes().agregar(nueva);
    }
    
    public Tramite registrarIngreso(Usuario datos, String asunto, int prio, Documento ref, Dependencia dep) {
        Tramite nuevo = new Tramite( datos,asunto, prio, ref,dep);
        Fecha ini = new Fecha();
        nuevo.setInicio(ini);
        String evento = "Se inicializa el tramite en dependencia: " + dep.getNombre();
        nuevo.getEventos().agregar(evento);
        dep.getEncolados().encolar(nuevo);
        return nuevo;
    }
    
    public void registrarUsuario(Gestion_Tramite sistema,String dni, String nombre, String fono, String email){
        Usuario nuevo = new Usuario(dni,nombre,fono,email);
        sistema.getUser().agregar(nuevo);
        
    }
    public void registrarMovimiento(boolean prio, Dependencia Origen, Dependencia Final) {
        if (prio) {
            Tramite mov = menorPrio(Origen.getEncolados());
            String actu = "Tramite se ha movido de dependencia: " + Origen.getNombre() + " a dependencia: " + Final.getNombre();
            mov.getEventos().agregar(actu);
            Final.getEncolados().encolar(mov);
        } else {
            Tramite mov = Origen.getEncolados().desencolar();
            String actu = "Tramite se ha movido de dependencia: " + Origen.getNombre() + " a dependencia: " + Final.getNombre();
            mov.getEventos().agregar(actu);
            Final.getEncolados().encolar(mov);
        }
    } //Corregir cambios en los parametros (no estan cambiando)
    
    public void registrarFinal(boolean prio, Gestion_Tramite sistema, Dependencia depe) {
        if (prio) {
            Tramite fin = menorPrio(depe.getEncolados());
            String finalizo = "Evento ha finalizado satisfactoriamente en dependencia: " + depe.getNombre();
            fin.getEventos().agregar(finalizo);
            sistema.getHistorial().agregar(fin);
        } else {
            Tramite fin = depe.getEncolados().desencolar();
            String finalizo = "Evento ha finalizado satisfactoriamente en dependencia: " + depe.getNombre();
            fin.getEventos().agregar(finalizo);
            sistema.getHistorial().agregar(fin);
        }
    }
    
    public void observarTramite(Gestion_Tramite sistema, String uid) {
        Tramite objetivo = BuscarporUID(sistema, uid);
        System.out.println(objetivo.getAsunto());
    }
    
    public static Tramite menorPrio(Cola<Tramite> ordenar){
        if (ordenar.esVacia()) {
            throw new RuntimeException("ERROR: la cola está vacía");
        }
        Cola<Tramite> aux = new Cola<>();
        Cola<Tramite> temp = new Cola<>();
        Nodo<Tramite> menor = null;
        
        while(!ordenar.esVacia()) {
            Tramite actual = ordenar.desencolar();
            aux.encolar(actual);
            
            if(menor == null || (actual.getPrio() < menor.getElemento().getPrio())) {
                menor = new Nodo<>(actual, null);
            }
        }
        boolean menorfuera = false;
        while(!aux.esVacia()) {
            Tramite actual = aux.desencolar();
            if(!menorfuera && actual.equals(menor.getElemento())) {
                menorfuera = true;
            } else {
                temp.encolar(actual);
            }
        }
        while(!temp.esVacia()) {
            ordenar.encolar(temp.desencolar());
        }
        
        return menor.getElemento();
    }
    
   public Tramite BuscarporUID(Gestion_Tramite sistema, String uid) {
    Lista<Tramite> hist = sistema.getHistorial();
    Tramite nov = null;
    // Buscar en las dependencias activas
    Lista <Dependencia> dep = sistema.getDepes();
       for(int i =1; i<dep.longitud()+1; i++){
            Cola <Tramite> tr = dep.iesimo(i).getEncolados();
            Cola<Tramite> tempCola = new Cola<>();
            while (!tr.esVacia()) {
            Tramite tr1 = tr.desencolar();
            
            if(tr1.getUID().equalsIgnoreCase(uid)){
                return tr1;
            }
            
            tempCola.encolar(tr1);
            }

            while (!tempCola.esVacia()) {
            tr.encolar(tempCola.desencolar());
            }
       }
    // Si el trámite no está en las colas activas, buscar en el historial
    for (int i = 1; i <= hist.longitud(); i++) {
        Tramite actual = hist.iesimo(i);
        if (actual.getUID().equals(uid)) {
            // Duplicar el trámite encontrado desde el historial
            Tramite duplicado = actual; // Suponiendo que Tramite tenga un constructor copia
            return duplicado;
        }
    }

    return null;
}



    
    public static Dependencia BuscarDepe(Gestion_Tramite sistema, String nombre) {
        Dependencia dependenciaSeleccionada = null;
        Lista<Dependencia> listasDependencias = sistema.getDepes();
        if(listasDependencias.esVacia()) {
            throw new RuntimeException("Lista vacia, ingresar dependencias");
        }
        for(int i = 1; i < listasDependencias.longitud() + 1; i++) {
            Dependencia actual = listasDependencias.iesimo(i);
            if (actual.getNombre().equals(nombre)) {
                dependenciaSeleccionada = actual;
                break;
            }
        }
        if (dependenciaSeleccionada == null) {
            return dependenciaSeleccionada;
        }
        return dependenciaSeleccionada;
    }
    
    public static Usuario BuscarUsuario(Gestion_Tramite sistema, String nombre) {
        Usuario usuarioSeleccionado = null;
        Lista<Usuario> listasUsuario = sistema.getUser();
        if(listasUsuario.esVacia()) {
            throw new RuntimeException("Lista vacia, ingresar usuarios");
        }
        for(int i = 1; i < listasUsuario.longitud() + 1; i++) {
            Usuario actual = listasUsuario.iesimo(i);
            if (actual.getNombre().equals(nombre)) {
                usuarioSeleccionado = actual;
                break;
            }
        }
        if (usuarioSeleccionado == null) {
            return usuarioSeleccionado;
        }
        return usuarioSeleccionado;
    }
    
    public static Cola<Tramite> OrdenarPrio(Dependencia dep) {
       Cola<Tramite> original = dep.getEncolados();
       Cola<Tramite> nueva = new Cola<>();
       Cola<Tramite> aux = new Cola<>();
       while(!original.esVacia()) {
           Tramite nov = original.desencolar();
           nueva.encolar(nov);
           aux.encolar(nov);
       }
       while(!aux.esVacia()) {
           original.encolar(aux.desencolar());
       }
       
       Cola<Tramite> colaOrdenada = new Cola<>();
       
       while(!nueva.esVacia()) {
           Tramite tra = nueva.desencolar();
           insertarEnOrden(colaOrdenada,tra);
       }
       return colaOrdenada;
    }
    
    private static void insertarEnOrden(Cola<Tramite> cola, Tramite tra) {
        Cola<Tramite> aux = new Cola<>();
        while(!cola.esVacia() && cola.frente().getPrio() <= tra.getPrio()) {
            aux.encolar(cola.desencolar());
        }
        aux.encolar(tra);
        
        while(!cola.esVacia()) {
            aux.encolar(cola.desencolar());
        }
        while(!aux.esVacia()) {
            cola.encolar(aux.desencolar());
        }
    }
    public static Lista<Tramite> OrdenarPrioHistorial(Lista <Tramite> Historial) {
        Lista<Tramite> original = Historial ;
        Lista<Tramite> nueva = new Lista<>();
        Lista<Tramite> aux = new Lista<>();

        int longitudOriginal = original.longitud();

        for (int i = 1; i <= longitudOriginal; i++) {
            Tramite nov = original.iesimo(i);
            nueva.agregar(nov);
            aux.agregar(nov);
        }

        Lista<Tramite> colaOrdenada = new Lista<>();

        int longitudNueva = nueva.longitud();

        for (int i = 1; i <= longitudNueva; i++) {
            Tramite tra = nueva.iesimo(i);
            insertarEnOrdenHistorial(colaOrdenada, tra);
        }

        return colaOrdenada;
    }
    private static void insertarEnOrdenHistorial(Lista<Tramite> lista, Tramite tra) {
        Lista<Tramite> aux = new Lista<>();

        int longitudLista = lista.longitud();
        boolean insertado = false;

        for (int i = 1; i <= longitudLista; i++) {
            Tramite actual = lista.iesimo(i);
            if (!insertado && actual.getPrio() > tra.getPrio()) {
                aux.agregar(tra);
                insertado = true;
            }
            aux.agregar(actual);
        }

        if (!insertado) {
            aux.agregar(tra);
        }

        while (lista.longitud() > 0) {
            lista.eliminar(1);
        }

        int longitudAux = aux.longitud();

        for (int i = 1; i <= longitudAux; i++) {
            lista.agregar(aux.iesimo(i));
        }
        }
    
    
    
}