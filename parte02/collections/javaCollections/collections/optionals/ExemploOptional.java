package parte02.collections.javaCollections.collections.optionals;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println(optionalString.isPresent());

//        optionalString.isPresent(System.out::println);
//
//        optionalString.ifPresentOrElse(System.out::println,
//                () -> System.out.println("Valor não está presente"));
//        if (optionalString.isPresent()) {
//            String valor = optionalString.get();
//
//            System.out.println(valor);
//        }
//
//        optionalString.map((valor) -> valor.concat("***")).isPresent(System.out::printf);
//
//        optionalString.orElseThrow(IllegalAccessError::new);
    }

}
