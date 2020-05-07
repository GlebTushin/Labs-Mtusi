public class t8 {public static String Roman(int Numeral) {String s="";
    switch (Numeral%10) {
        case 1 :{s=s+"I";
            break;}
        case 2:{s=s+"II";
            break; }
        case 3:{s=s+"III";
            break;}
        case 4:{s=s+"IV";
            break;}
        case 5:{s=s+"V";
            break;}
        case 6:{s=s+"VI";
            break;}
        case 7:{s=s+"VII";
            break;}
        case 8:{s=s+"VIII";
            break;}
        case 9:{s=s+"IX";
            break;}
    }
    Numeral=Numeral/10;
    switch (Numeral%10) {
        case 1 :{s="X"+s;
            break;}
        case 2:{s="XX"+s;
            break; }
        case 3:{s="XXX"+s;
            break;}
        case 4:{s="XL"+s;
            break;}
        case 5:{s="L"+s;
            break;}
        case 6:{s="LX"+s;
            break;}
        case 7:{s="LXX"+s;
            break;}
        case 8:{s="LXXX"+s;
            break;}
        case 9:{s="LC"+s;
            break;}
    }
Numeral=Numeral/10;
    switch (Numeral%10)
    { case 1 :{s="C"+s;
        break;}
        case 2:{s="CC"+s;
            break; }
        case 3:{s="CCC"+s;
            break;}
        case 4:{s="CD"+s;
            break;}
        case 5:{s="D"+s;
            break;}
        case 6:{s="DC"+s;
            break;}
        case 7:{s="DCC"+s;
            break;}
        case 8:{s="DCCC"+s;
            break;}
        case 9:{s="CM"+s;
            break;}
    }
    Numeral=Numeral/10;
    switch (Numeral%10){
        case 1:{s="M"+s;
            break;}
        case 2:{s="MM"+s;
            break;}
        case 3:{s="MMM"+s;
            break;}
    }


return s;
}
}
