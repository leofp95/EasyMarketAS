package com.example.rtayl.easymarket;

/**
 * Created by Leo on 5/21/17.
 */

public class MyData {

    static String[] nameArray = {"Samsung Galaxy S7", "iPhone 7", "Exploding Kittens", "Gibson SG", "Epiphone Les Paul", "Honeycomb", "Ice Cream Sandwich","JellyBean", "Kitkat", "Lollipop", "Marshmallow"};
    static String[] versionArray = {"Telefonos", "Telefonos", "Juegos de Mesa", "Instrumentos Musicales", "Instrumentos Musicale", "3.0-3.2.6", "4.0-4.0.4", "4.1-4.3.1", "4.4-4.4.4", "5.0-5.1.1","6.0-6.0.1"};

    static Integer[] drawableArray = {R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_text_light_normal,
            R.drawable.common_full_open_on_phone, R.drawable.common_google_signin_btn_icon_dark_normal, R.drawable.googleg_disabled_color_18, R.drawable.ic_add_shopping_cart_black_24dp,
            R.drawable.ic_account_box_black_24dp, R.drawable.ic_payment_black_24dp, R.drawable.common_full_open_on_phone,R.drawable.side_nav_bar};

    static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static DataModel getData(int id){
        return new DataModel(nameArray[id],versionArray[id],id_[id],drawableArray[id]);
    }

}
