package com.example.baitap2;

public class RawDataDish {
    private String[] dish_name;
    private String[] dish_describe;
    private String[] dish_ingredients;
    private int[] dish_iamge;
    private int[] dish_iamge_large;
    private int[] dish_timeprep;
    private int[] dish_timecook;

    public RawDataDish(){
        String[] dish_name ={
                "Crispy Parmesan-Ranch Roasted Veggies",
                "Queso Macaroni and Cheese",
                "Easy Ravioli Bake",
                "Italian Pork Chops",
                "Peek-a-Boo PEEPS?Bunny Brownies",
                "Slab Strawberry Shortcake",
                "Beef Taquito Casserole",
                "Taco Crescent Ring",
                "Creamy Strawberry Dip",
                "Dill Pickle Dip"
        };
        String[] dish_describe = {"The secret to getting everyone to eat their veggies is probably sitting in your pantry. We抮e talking about that little packet of dry ranch dressing mix, which is the key to these totally addictive roasted veggies梱es, veggies really can be addictive. In this recipe, perfectly caramelized baby red potatoes, broccoli and red onion get a crispy coating of buttery, toasted panko, a sprinkle of Parmesan and a garnish of parsley, for a dish that looks as good as it tastes. So next time you need a crowd-pleasing side, reach for your ranch and watch those veggies get devoured!",
                "Oh yes we did! This creamy, zippy spin on macaroni and cheese is a queso lover抯 dream come true. Top with your favorite fresh toppings for a simple casserole that no one can resist.",
                "If you love to order cheese ravioli when you抮e at your favorite Italian eatery, you can now have that restaurant-quality meal at home, with the no-fuss prep of a baked casserole. Using frozen ravioli means you can get right to assembling baked ravioli for a quick and delicious dinner.",
                "Chop, chop! These Italian-flavored chops are ready in minutes!",
                "A blooming field full of curious, colorful bunnies will make this the cutest dessert at your springtime celebration. Made easy with Betty Crocker?Supreme Original brownie mix, this adorable dessert is all about getting playful with decorating. Create a flower-strewn sp...",
                "Shortcake to feed a crowd! With no individual assembly required, this genius recipe couldn't be more perfect for all of your spring and summer gatherings.",
                "Frozen beef taquitos are the perfect topper for this flavorful, veggie-packed Southwestern casserole. Serve with all your favorite toppings, like cilantro, sour cream and green onions.",
                "It's no mistake that this genius taco crescent ring is one of the all time, most popular recipes on Pillsbury.com. It's easy, beefy, cheesy and comes loaded with all the best taco toppings. And did we mention how fun it is to make?",
                "You can make this sweet strawberry yogurt dip with just 5 ingredients and 10 minutes. Fresh fruit, cookies and graham crackers all make delicious dippers!",
                "Dill pickle fans will love this creamy, tangy dip, which is great served with pretzels, potato chips or vegetables!"
        };
        String[] dish_ingredients = {
                "5 tablespoons butter\n" +
                        "1/4 teaspoon garlic powder\n" +
                        "1/4 teaspoon black pepper\n" +
                        "1 1/2 lb baby red potatoes, quartered\n" +
                        "1 cup red onion wedges\n" +
                        "1 package (1 oz) dry ranch salad dressing and seasoning mix\n" +
                        "1/8 teaspoon salt\n" +
                        "4 cups small broccoli florets\n" +
                        "1/4 cup Progresso?plain panko crispy bread crumbs\n" +
                        "1/4cup shredded Parmesan cheese (1 oz)\n" +
                        "2 tablespoons chopped fresh Italian (flat-leaf) parsley leaves",
                "1 package (16 oz) uncooked penne pasta\n" +
                        "1 tablespoon vegetable oil\n" +
                        "1 medium red bell pepper, diced\n" +
                        "1/4 teaspoon ground cumin\n" +
                        "1/4 teaspoon salt\n" +
                        "2 cans (4.5 oz each) Old El Paso?chopped green chiles\n" +
                        "3 tablespoons butter\n" +
                        "3 tablespoons Gold Medal?all-purpose flour\n" +
                        "3 cups milk\n" +
                        "1 package (16 oz) Kraft?Velveeta?original cheese product, cut into 1-inch cubes\n" +
                        "1 cup shredded Cheddar cheese (4 oz)\n" +
                        "2 medium plum (Roma) tomatoes, chopped\n" +
                        "1 medium avocado, pitted, peeled and cubed\n" +
                        "2 tablespoons chopped fresh cilantro leaves",
                "1 jar (25.5 oz) Muir Glen?organic pasta sauce (any variety)\n" +
                        "1 package (25 to 27 1/2 oz) frozen cheese-filled ravioli\n" +
                        "2 cups shredded mozzarella cheese (8 oz)\n" +
                        "2 tablespoons grated Parmesan cheese",
                "1/2 cup Original Bisquick?mix\n" +
                        "1/3 cup Italian dressing\n" +
                        "1/2 cup Progresso?garlic herb bread crumbs\n" +
                        "4 pork boneless loin chops, 1/2 inch thick (1 1/2 pounds)\n" +
                        "2 tablespoons vegetable oil",
                "1 box Betty Crocker?Supreme Original brownie mix\n" +
                        "Water, oil and eggs called for on brownie mix box\n" +
                        "1 cup Betty Crocker?Rich & Creamy vanilla frosting (from 16-oz container)\n" +
                        "Betty Crocker?green gel food color\n" +
                        "16 PEEPS?brand marshmallow bunnies\n" +
                        "Flower-shaped candy sprinkles",
                "3 1/2cups Gold Medal?all-purpose flour\n" +
                        "1/2 cup granulated sugar\n" +
                        "5 teaspoons baking powder\n" +
                        "1/2 teaspoon salt\n" +
                        "1 cup cold butter, cut in pieces\n" +
                        "2 eggs, slightly beaten\n" +
                        "2 cups heavy whipping cream",
                "1 bag (10 oz) frozen white rice (1 1/2 cups cooked rice)\n" +
                        "1 bag (12 oz) frozen whole kernel sweet corn\n" +
                        "1 can (15 oz) Progresso?black beans, drained, rinsed\n" +
                        "1 package (1 oz) Old El Paso?original taco seasoning mix\n" +
                        "1 can (10 oz) Old El Paso?mild enchilada sauce\n" +
                        "2 cups finely shredded Mexican cheese blend (8 oz)\n" +
                        "1 box (20 oz) frozen taquitos (beef in corn tortillas)\n" +
                        "Chopped fresh cilantro, sliced green onions, chopped tomatoes, sour cream, if desired",
                "1 lb ground beef\n" +
                        "1 package (1 oz) Old El Paso?taco seasoning mix\n" +
                        "1/2 cup water\n" +
                        "1 cup shredded Cheddar cheese (4 oz)\n" +
                        "2 cans (8 oz each) Pillsbury?refrigerated crescent dinner rolls\n" +
                        "Shredded lettuce, chopped tomatoes, sliced ripe olives, taco sauce or salsa, as desired\n",
                "4 oz cream cheese, softened (from 8-oz package)\n" +
                        "2 containers (6 oz each) Yoplait?Original strawberry yogurt SAVE $\n" +
                        "1/4 cup powdered sugar\n" +
                        "3/4 teaspoon vanilla\n" +
                        "1/4 cup chopped strawberries\n" +
                        "Dippers, such as fresh whole strawberries, grapes, cut-up melon, blueberries, cookies, graham crackers, as desired\n",
                "1 container (8 oz) chive & onion cream cheese spread\n" +
                        "1/2 cup sour cream\n" +
                        "2 tablespoons pickle juice\n" +
                        "1/4 teaspoon garlic powder\n" +
                        "1 cup diced kosher dill pickles\n" +
                        "4 teaspoons chopped fresh dill weed\n" +
                        "Pretzels or potato chips"
        };
        int[] dish_iamge ={R.drawable.dish1,R.drawable.dish2,R.drawable.dish3,R.drawable.dish4,R.drawable.dish5,R.drawable.dish6,R.drawable.dish7,R.drawable.dish8,R.drawable.dish9,R.drawable.dish10};
        int[] dish_iamge_large ={R.drawable.dish1_large,R.drawable.dish2_large,R.drawable.dish3_large,R.drawable.dish4_large,R.drawable.dish5_large,R.drawable.dish6_large,R.drawable.dish7_large,R.drawable.dish8_large,R.drawable.dish9_large,R.drawable.dish10_large};
        int[] dish_timeprep = {10,12,11,20,15,12,15,12,15,12};
        int[] dish_timecook = {20,22,30,30,25,30,25,30,30,25};
        this.dish_name = dish_name;
        this.dish_describe = dish_describe;
        this.dish_ingredients = dish_ingredients;
        this.dish_iamge = dish_iamge;
        this.dish_iamge_large = dish_iamge_large;
        this.dish_timeprep = dish_timeprep;
        this.dish_timecook = dish_timecook;

    }
    public String[] getDish_name() {
        return dish_name;
    }

    public void setDish_name(String[] dish_name) {
        this.dish_name = dish_name;
    }

    public String[] getDish_describe() {
        return dish_describe;
    }

    public void setDish_describe(String[] dish_describe) {
        this.dish_describe = dish_describe;
    }

    public String[] getDish_ingredients() {
        return dish_ingredients;
    }

    public void setDish_ingredients(String[] dish_ingredients) { this.dish_ingredients = dish_ingredients; }

    public int[] getDish_iamge() {
        return dish_iamge;
    }

    public void setDish_iamge(int[] dish_iamge) {
        this.dish_iamge = dish_iamge;
    }

    public int[] getDish_iamge_large() {
        return dish_iamge_large;
    }

    public void setDish_iamge_large(int[] dish_iamge_large) {
        this.dish_iamge_large = dish_iamge_large;
    }

    public int[] getDish_timeprep() {
        return dish_timeprep;
    }

    public void setDish_timeprep(int[] dish_timeprep) {
        this.dish_timeprep = dish_timeprep;
    }

    public int[] getDish_timecook() {
        return dish_timecook;
    }

    public void setDish_timecook(int[] dish_timecook) {
        this.dish_timecook = dish_timecook;
    }
}
