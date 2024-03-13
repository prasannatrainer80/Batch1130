var restaurant = [
    "Kritunga", "Mehfil", "Paradise",
    "4AM","Ghumaghumalu","Babai Hotel",
    "Meghana","Pista House","Bawarchi"
]

var restaurantImages = new 
        Array("url('images/rest.jpg')", 
        "url('images/rest1.jpg')", 
        "url('images/rest3.jpg')", 
        "url('images/rest4.jpg')", 
        "url('images/rest5.jpg')", 
        "url('images/rest6.jpg')", 
        "url('images/rest7.jpg')", 
        "url('images/rest9.jpg')", 
        "url('images/rest8.jpg')");

var restaurantIndex = 0;
var restaurantCount = restaurant.length;
var menuItems = new Array(restaurantCount);
var priceList = new Array(restaurantCount);
for (var p = 0; p < restaurantCount; p++) {
    menuItems[p] = new Array(8);
}

for(var p = 0; p < restaurantCount; p++) {
    priceList[p] = new Array(8);
}

menuItems[0][0]="Chicken Biryani";
menuItems[0][1]="Tandoori Chiken";
menuItems[0][2]="Mutton Biryani";
menuItems[0][3]="Prans Biryani";
menuItems[0][4]="Fish Fry";
menuItems[0][5]="Veg Biryani";
menuItems[0][6]="Keema Masala";
menuItems[0][7]="Paneer Biryani";

menuItems[1][0] = "Dosa";
menuItems[1][1] = "Babai Idly";
menuItems[1][2] = "Upma Poori";
menuItems[1][3] = "Three Short Utappam";
menuItems[1][4] = "MLA Pesarattu";
menuItems[1][5] = "70 MM Dosa";
menuItems[1][6] = "Ghee Karam Dosa";
menuItems[1][7] = "Corn Dosa";

menuItems[2][0] = "Puri Bhaji";
menuItems[2][1] = "Aloo Parantha";
menuItems[2][2] = "Steamed Idli";
menuItems[2][3] = "Medu Wada";
menuItems[2][4] = "Sada Dosa";
menuItems[2][5] = "Masala Dosa";
menuItems[2][6] = "Uttappam";
menuItems[2][7] = "Onion Rawa Masala Dosa";

menuItems[3][0] = "DosaSpecial Banjara Paneer Kebab";
menuItems[3][1] = "Tandoori Paneer Tikka";
menuItems[3][2] = "Pahadi Paneer Tikka";
menuItems[3][3] = "Atishi Tandoori Aloo";
menuItems[3][4] = "Veg.Seekh Kebab";
menuItems[3][5] = "Kurkure Bhindi";
menuItems[3][6] = "Tandoori Corn";
menuItems[3][7] = "Paneer Malai Tikka";

menuItems[4][0] = "Tandoori Paneer Tikka";
menuItems[4][1] = "Pahadi Mushroom";
menuItems[4][2] = "Vietnamese Grilled Veg";
menuItems[4][3] = "Veg.Shammi Kebeb";
menuItems[4][4] = "Cajun Spice Potato";
menuItems[4][5] = "Crispy Corn";
menuItems[4][6] = "Chatkari Fruit Skewer";
menuItems[4][7] = "Angara Chicken Tikka";

menuItems[5][0] = "Tomatto Soup";
menuItems[5][1] = "Vegetable Soup";
menuItems[5][2] = "Palak Cheese Soup";
menuItems[5][3] = "Sweet Corn Soup";
menuItems[5][4] = "Manchow Soup";
menuItems[5][5] = "Wonton Soup";
menuItems[5][6] = "French Onion Soup";
menuItems[5][7] = "Lung Fung Soup";

menuItems[6][0] = "Tangdi Kebab Full";
menuItems[6][1] = "Tangdi Kebab Half";
menuItems[6][2] = "Chicken Tandoori Full";
menuItems[6][3] = "Chicken Tandoori Half";
menuItems[6][4] = "Banjara Kebab";
menuItems[6][5] = "Chicken Sheek Kebab";
menuItems[6][6] = "Chicken Tikka";
menuItems[6][7] = "Malai Kebab";

menuItems[7][0] = "Paneer Butter Masala";
menuItems[7][1] = "Paneer Tikka Masala";
menuItems[7][2] = "Paneer Chips Masala";
menuItems[7][3] = "Mutter Paneer";
menuItems[7][4] = "Palak Paneer";
menuItems[7][5] = "Shahi Paneer";
menuItems[7][6] = "Paneer Kadai";
menuItems[7][7] = "Paneer Bhurji";

menuItems[8][0] = "Dosa";
menuItems[8][1] = "Poori";
menuItems[8][2] = "Chapathi";
menuItems[8][3] = "Paneer Dosa";
menuItems[8][4] = "Mutter Paneer";
menuItems[8][5] = "Ragi Sankati";
menuItems[8][6] = "Butter Naan";
menuItems[8][7] = "Plain Naan";


priceList[0][0] = 340;
priceList[0][1] = 290;
priceList[0][2] = 333;
priceList[0][3] = 198;
priceList[0][4] = 234;
priceList[0][5] = 542;
priceList[0][6] = 443;
priceList[0][7] = 466;

priceList[1][0] = 120;
priceList[1][1] = 110;
priceList[1][2] = 180;
priceList[1][3] = 220;
priceList[1][4] = 200;
priceList[1][5] = 399;
priceList[1][5] = 350;
priceList[1][6] = 400;
priceList[1][7] = 280;

priceList[2][0] = 660;
priceList[2][1] = 670;
priceList[2][2] = 600;
priceList[2][3] = 550;
priceList[2][4] = 600;
priceList[2][5] = 650;
priceList[2][5] = 660;
priceList[2][6] = 700;
priceList[2][7] = 825;

priceList[3][0] = 300;
priceList[3][1] = 280;
priceList[3][2] = 270;
priceList[3][3] = 230;
priceList[3][4] = 260;
priceList[3][5] = 230;
priceList[3][5] = 290;
priceList[3][6] = 240;
priceList[3][7] = 280;

priceList[4][0] = 590;
priceList[4][1] = 499;
priceList[4][2] = 375;
priceList[4][3] = 550;
priceList[4][4] = 700;
priceList[4][5] = 379;
priceList[4][5] = 450;
priceList[4][6] = 500;
priceList[4][7] = 380;

priceList[5][0] = 65;
priceList[5][1] = 60;
priceList[5][2] = 70;
priceList[5][3] = 80;
priceList[5][4] = 90;
priceList[5][5] = 60;
priceList[5][5] = 100;
priceList[5][6] = 70;
priceList[5][7] = 80;

priceList[6][0] = 300;
priceList[6][1] = 190;
priceList[6][2] = 300;
priceList[6][3] = 190;
priceList[6][4] = 290;
priceList[6][5] = 300;
priceList[6][5] = 290;
priceList[6][6] = 295;
priceList[6][7] = 320;

priceList[7][0] = 190;
priceList[7][1] = 180;
priceList[7][2] = 195;
priceList[7][3] = 190;
priceList[7][4] = 185;
priceList[7][5] = 190;
priceList[7][5] = 195;
priceList[7][6] = 200;
priceList[7][7] = 210;

priceList[8][0] = 345;
priceList[8][1] = 322;
priceList[8][2] = 111;
priceList[8][3] = 177;
priceList[8][4] = 277;
priceList[8][5] = 222;
priceList[8][5] = 256;
priceList[8][6] = 214;
priceList[8][7] = 145;

function prevRestaurant() {
    restaurantIndex--;
    if (restaurantIndex < 0) {
        restaurantIndex = 0;
        alert("No Restaurants Before this...");
    }
    load();
}

function nextRestaurant() {
    restaurantIndex++;
    if (restaurantIndex == restaurantCount) {
        restaurantIndex = restaurantCount -1;
        alert("No Restaurants after this...");
    }
    load();   
}
function load() {
    document.getElementById("restaurant").innerHTML = 
            restaurant[restaurantIndex];
    document.getElementById("item1").innerHTML = 
    menuItems[restaurantIndex][0];
    document.getElementById("item1price").innerHTML = 
    priceList[restaurantIndex][0];

    document.getElementById("item2").innerHTML = 
    menuItems[restaurantIndex][1];
    document.getElementById("item2price").innerHTML = 
    priceList[restaurantIndex][1];

    document.getElementById("item3").innerHTML = 
    menuItems[restaurantIndex][2];
    document.getElementById("item3price").innerHTML = 
    priceList[restaurantIndex][2];

    document.getElementById("item4").innerHTML = 
    menuItems[restaurantIndex][3];
    document.getElementById("item4price").innerHTML = 
    priceList[restaurantIndex][3];

    document.getElementById("item5").innerHTML = 
    menuItems[restaurantIndex][4];
    document.getElementById("item5price").innerHTML = 
    priceList[restaurantIndex][4];

    document.getElementById("item6").innerHTML = 
    menuItems[restaurantIndex][5];
    document.getElementById("item6price").innerHTML = 
    priceList[restaurantIndex][5];

    document.getElementById("item7").innerHTML = 
    menuItems[restaurantIndex][6];
    document.getElementById("item7price").innerHTML = 
    priceList[restaurantIndex][6];

    document.getElementById("item8").innerHTML = 
    menuItems[restaurantIndex][7];
    document.getElementById("item8price").innerHTML = 
    priceList[restaurantIndex][7];
    document.body.style.backgroundImage = restaurantImages[restaurantIndex];
}