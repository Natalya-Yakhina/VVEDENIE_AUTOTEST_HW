//package org.example.HW__2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Сontainer implements IElement { // контейнер, состоит из компонентов
//    public List<IElement> components = new ArrayList<>();
//
//    public void add(IElement component) {
//        components.add(component);
//    }
//
//    public void remove(IElement component) {
//        components.remove(component);
//    }
//    @Override
//    public void writeDown() {
//        for (IElement component : components) {
//            component.writeDown();
//        }
//    }
//
////    void add(IElement component){
////        components.add(component);
////    }
////
////    public void remove(IElement component) {
////        components.remove(component);
////    }
////    @Override
////    public Long getPrice() {
////
////        AtomicReference<Long> result = new AtomicReference<>(0L);
////        components.forEach(iComponent -> {
////            result.set(result.get() + iComponent.getPrice());
////        });
////        return result.get();
////    }
////
////    public void add(IElement component) {
////        components.add(component);
////    }
//}
