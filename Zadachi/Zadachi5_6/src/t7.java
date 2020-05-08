public class t7 {
    public static String Value(int num) {
        if (num==0)
            return "zero";
        String form="";
        switch (num/100){
            case 1:{form=form+"one hundred  ";
            break;}
            case 2:{form=form+"two hundred ";
                break;}
            case 3:{form=form+"three hundred";
                break;}
                case 4:{form=form+"four hundred ";
                break;}
            case 5:{form=form+"five hundred ";
                break;}
            case 6:{form=form+"six hundred ";
                break;}
            case 7:{form=form+"seven hundred ";
                break;}
            case 8:{form=form+"eight hundred ";
                break;}
            case 9:{form=form+"nine hundred ";
                break;}}
           num =num%100;
            switch (num/10){
                case 1:{
                    switch (num%10){
                    case 0:{ return  form + "ten";
                        }
                    case 1:{
                        return form+"eleven";
                    }

                    case 2: { return form+"twelve";
                    }
                    case 3:{return form+"thirteen";
                        }
                    case 4:{return form+"fourteen";
                        }
                    case 5:{return form+"fifteen";
                    }
                    case 6:{return form+"sixteen";
                        }
                    case 7:{return form+"seventeen";
                        }
                    case 8:{return form+"eighteen";
                        }
                    case 9:{return form+"nineteen";
                     }
                }
                    break;}
                case 2:{form=form+"twenty ";
                    break;}
                case 3:{form=form+"thirty ";
                    break;}
                case 4:{form=form+"forty ";
                    break;}
                case 5:{form=form+"fifty ";
                    break;}
                case 6:{form=form+"sixty ";
                    break;}
                case 7:{form=form+"seventy ";
                    break;}
                case 8:{form=form+"eighty ";
                    break;}
                case 9:{form=form+"ninety ";
                    break;}

        }
            switch (num%10){
                case 1:{
                    return form+"one";
                }

                case 2:
                { return form+"two";
                }
                case 3:{return form+"three";
                    }
                case 4:{return form+"four";
                    }
                case 5:{return form+"five";
                    }
                case 6:{return form+"six";
                    }
                case 7:{return form+"seven";
                    }
                case 8:{return form+"eight";
                    }
                case 9:{return form+"nine";

                }
            }

  return form;
}
}