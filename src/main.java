import java.util.ArrayList;
import java.util.List;

public class main {
    public interface Component {
        public void operation();
    }


    public static class Leaf implements Component {
        private String name;
        public Leaf(String name) {
            this.name = name;
        }
        @Override
        public void operation() {
            System.out.println("Operação do componente " + this.name);
        }
    }

    public static class Composite implements Component {

        private String name;
        private List<Component> children = new ArrayList<>();

        public Composite(String name) {
            this.name = name;
        }

        public void add(Component component) {
            this.children.add(component);
        }

        public void remove(Component component) {
            this.children.remove(component);
        }

        @Override
        public void operation() {
            System.out.println("Operação do componente composto " + this.name);
            for (Component component : this.children) {
                component.operation();
            }
        }

        public static Composite computador = new Composite("Computador");

    }

    public static void main(String[] args) {

        Leaf mouse = new Leaf("Mouse");
        Leaf teclado = new Leaf("Teclado");
        Leaf monitor = new Leaf("Monitor");
        Leaf impressora = new Leaf("Impressora");

        Composite cpu = new Composite("CPU");
        cpu.add(new Leaf("Processador"));
        cpu.add(new Leaf("Memória RAM"));

        cpu.add(mouse);
        cpu.add(teclado);
        cpu.add(monitor);
        cpu.add(impressora);

        cpu.operation();
    }
}
