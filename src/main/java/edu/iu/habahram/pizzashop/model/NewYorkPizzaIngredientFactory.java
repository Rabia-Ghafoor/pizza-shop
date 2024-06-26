package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaIngredientFactory
            implements PizzaIngredientFactory
    {

        public Dough createDough() {
            return new ThickCrustDough();
        }

        public Sauce createSauce() {
            return new PlumTomatoSauce();
        }

        public Cheese createCheese() {
            return new MozzarellaCheese();
        }

        public Veggies[] createVeggies() {
            Veggies veggies[] = { new BlackOlives(),
                    new Spinach(),
                    new Eggplant() };
            return veggies;
        }

        public Pepperoni createPepperoni() {
            return new SlicedPepperoni();
        }

        public Clams createClam() {
            return new FrozenClams();
        }
    }


