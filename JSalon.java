package Project;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface Payment
{
	public void getDetails();
}
class Unissalon implements Payment
{
	int sum=0;
	double prod_price;
	String info;
	private String cust_name;
	private long cust_contact;
	private String cust_email_id;
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public long getCust_contact() {
		return cust_contact;
	}
	public void setCust_contact(long cust_contact) {
		this.cust_contact = cust_contact;
	}
	public String getCust_email_id() {
		return cust_email_id;
	}
	public void setCust_email_id(String cust_email_id) {
		this.cust_email_id = cust_email_id;
	}

	public void A(double prod_price,String info)
	{
		this.prod_price=prod_price;
		this.info=info;
	}
	@Override
	public void getDetails()
	{
		System.out.println("Information:"+info);
		System.out.println("Product Price:"+prod_price);
		System.out.println("customer Name:"+cust_name);
		System.out.println("customer contact no:"+cust_contact);
		System.out.println("customer mail id:"+cust_email_id);
	}
	public void feedback()
	{
		System.out.println("Give Your feedback");
	}
}

class Gents extends Unissalon
{
	public void gents()
	{
		Unissalon Un1=new Hair_cut_finish();
		Hair_cut_finish hcf=(Hair_cut_finish)Un1;

		Unissalon Un2=new Hair_color();
		Hair_color hc=(Hair_color)Un2;

		Unissalon Un3=new Hair_texture();
		Hair_texture ht=(Hair_texture)Un3;

		Unissalon Un4=new Hair_treatments();
		Hair_treatments htr=(Hair_treatments)Un4;

		Unissalon Un5=new Skin_care();
		Skin_care sc=(Skin_care)Un5;

		Unissalon Un6=new Beard_grooming();
		Beard_grooming bg=(Beard_grooming)Un6;

		Unissalon Un7=new combo_offer_for_gents();
		combo_offer_for_gents cofg=(combo_offer_for_gents)Un7;

		Scanner a = new Scanner(System.in);
		System.out.println("Enter 1 for Hair_cut_finish");
		System.out.println("Enter 2 for Hair_color");
		System.out.println("Enter 3 for Hair_texture");
		System.out.println("Enter 4 for Hair_treatments");
		System.out.println("Enter 5 for Skin_care");
		System.out.println("Enter 6 for Beard_grooming");
		System.out.println("Enter 7 for combo_offer_for_gents");

		try {
		int opt = a.nextInt();
		switch (opt)
		{
		case 1:
			System.out.println("Your choice is Hair_cut_finish");
			hcf.hairCutFinish();
			break;
		case 2:
			System.out.println("Your choice is Hair_color");
			hc.hairColor();
			break;
		case 3:
			System.out.println("Your choice is Hair_texture");
			ht.hairTexture();
			break;
		case 4:
			System.out.println("Your choice is Hair_treatments");
			htr.hairTreatments();
			break;
		case 5:
			System.out.println("Your choice is Skin_care");
			sc.skinCare();
			break;
		case 6:
			System.out.println("Your choice is Beard_grooming");
			bg.beardGrooming();
			break;
		case 7:
			System.out.println("Your choice is combo_offer_for_gents");
			cofg.comboOfferGents();
			break;
		default:
			System.out.println("Invalid Input");
			this.gents();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			System.out.println();
			this.gents();
		}
	}
}

class Hair_cut_finish extends Gents
{
	public void hairCutFinish()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for cut_Haircare");
		System.out.println("Enter 2 for Sampoo_conditioning");
		System.out.println("Enter 3 for Head_Massage");
		System.out.println("Enter 4 for Beard_Styling");
		try {
		int opt = sc.nextInt();
		switch (opt)
		{
		case 1:
			System.out.println("Thank You For Choosing cut_Haircare");
			System.out.println("Step1: we will wash your hair");
			System.out.println("Step2: Select the style which you want");
			System.out.println("Step3: We will start with your Hair_cut");
			System.out.println("Finally we will set your hair");
			d.Final_Details(150, "Any Style");
			break;
		case 2:
			System.out.println("Thank You For Choosing Sampoo_conditioning");
			System.out.println("Step1: we will wash your hair");
			System.out.println("Step2: Then we will apply shampoo and wash again");
			System.out.println("Step3: Then we will apply conditioner and wash again");
			System.out.println("After that we will dry your hair and give a perfect look");
			d.Final_Details(100, "15min process");
			break;
		case 3:
			System.out.println("Thank You For Choosing Head_Massage");
			System.out.println("Step1: we will wash your hair");
			System.out.println("Step2: Then we will apply oil and do massage for 1/2hr");
			System.out.println("Step3: we will wash your hair again");
			System.out.println("Step4: Then we will apply shampoo and wash again");
			System.out.println("Step5: Then we will apply conditioner and wash again");
			d.Final_Details(200, "45min");
			break;
		case 4:
			System.out.println("Thank You For Choosing Beard_Styling");
			System.out.println("Step1: We will clean your face with face wash");
			System.out.println("Step2: Select the style which you want");
			System.out.println("Step3: We will start styling your Beard");
			System.out.println("Step4: We will clean your face");
			System.out.println("Finally you are ready");
			d.Final_Details(100, "Any Style");
			break;
		default:
			System.out.println("Invalid Input");
			this.hairCutFinish();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid input");
			this.hairCutFinish();
		}
	}
}

class Hair_color extends Gents
{
	public void hairColor()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Hair_color");
		System.out.println("Enter 2 for Hi_lites");
		System.out.println("Enter 3 for Beard_color");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Hair_color");
			System.out.println("Enter 1 for Ammonia");
			System.out.println("Enter 2 for Ammonia Free");
			int ot = sc.nextInt();
			switch (ot) {
			case 1:
				System.out.println("Thank You For Choosing Ammonia");
				d.Final_Details(500, "any color");
				break;
			case 2:
				System.out.println("Thank You For Choosing Ammonia free");
				d.Final_Details(700, "any color");
				break;
			default:
				System.out.println("Please select one option");
				this.hairColor();
				break;
			}
			break;
		case 2:
			System.out.println("Thank You For Choosing Hi_lites");
			System.out.println("Step1: we will wash your hair");
			System.out.println("Step2: your color choice and we will apply");
			System.out.println("Step3: dry the color for sometime");
			System.out.println("Step4: We will wash your hair");
			d.Final_Details(300, "any color");
			break;
		case 3:
			System.out.println("Thank You For Choosing Beard_color");
			System.out.println("Step1: we will wash your Beard");
			System.out.println("Step2: choose the color and we will apply");
			System.out.println("Step3: dry the color for sometime");
			System.out.println("Step4: We will wash your Beard");
			d.Final_Details(200, "any color");
			break;
		default:
			System.out.println("Invalid Input");
			this.hairColor();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.hairColor();
		}
	}
}

class Hair_texture extends Gents
{
	public void hairTexture()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Straightening");
		System.out.println("Enter 2 for Smoothening");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Straightening");
			d.Final_Details(1000, "Do not apply oil before");
			break;
		case 2:
			System.out.println("Thank You For Choosing Smoothening");
			d.Final_Details(500, "Do not apply oil before");
			break;
		default:
			System.out.println("Invalid Input");
			this.hairTexture();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.hairTexture();
		}
	}
}

class Hair_treatments extends Gents
{
	public void hairTreatments()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Hair_spa");
		System.out.println("Enter 2 for Advanced_Moisturing");
		System.out.println("Enter 3 for Scalp_Treatments");
		System.out.println("Enter 4 for color_Protection");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Hair_spa");
			d.Final_Details(1000, "2hr");
			break;
		case 2:
			System.out.println("Thank You For Choosing Advanced_Moisturing");
			d.Final_Details(2000, "2.5hr");
			break;
		case 3:
			System.out.println("Thank You For Choosing Scalp_Treatments");
			System.out.println("Please call before visiting");
			d.Final_Details(20000, "9000000000");
			break;
		case 4:
			System.out.println("Thank You For Choosing color_Protection");
			d.Final_Details(1500, "");
			break;
		default:
			System.out.println("Invalid Input");
			this.hairTreatments();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.hairTreatments();
		}
	}
}

class Skin_care extends Gents
{
	public void skinCare()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for clean_ups");
		System.out.println("Enter 2 for Facials");
		System.out.println("Enter 3 for Organic_Treatments");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing clean_ups");
			d.Final_Details(100, "1/2hr");
			break;
		case 2:
			System.out.println("Thank You For Choosing Facials");
			System.out.println("Enter 1 for Silver_Facial");
			System.out.println("Enter 2 for Golden_Facial");
			System.out.println("Enter 3 for Diamond_Facial");
			int ot = sc.nextInt();
			switch (ot) {
			case 1:
				System.out.println("Thank You For Choosing Silver_Facial");
				d.Final_Details(700, "1hr");
				break;
			case 2:
				System.out.println("Thank You For Choosing Golden_Facial");
				d.Final_Details(1000, "1hr");
				break;
			case 3:
				System.out.println("Thank You For Choosing Diamond_Facial");
				d.Final_Details(1500, "1hr");
				break;
			default:
				System.out.println("Please choose any one");
				this.skinCare();
				break;
			}
			break;
		case 3:
			System.out.println("Thank You For Choosing Organic_Treatments");
			d.Final_Details(1000, "2hr");
			break;
		default:
			System.out.println("Invalid Input");
			this.skinCare();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.skinCare();
		}
	}
}

class Beard_grooming extends Gents
{
	public void beardGrooming()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Beard_Trim");
		System.out.println("Enter 2 for Shave");
		System.out.println("Enter 3 for Luxary_shave_Beard_spa");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Beard_Trim");
			d.Final_Details(70, "any style");
			break;
		case 2:
			System.out.println("Thank You For Choosing Shave");
			d.Final_Details(100, "any style");
			break;
		case 3:
			System.out.println("Thank You For Choosing Luxary_shave_Beard_spa");
			d.Final_Details(500, "any style");
			break;
		default:
			System.out.println("Invalid Input");
			this.beardGrooming();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.beardGrooming();
		}
	}
}

class combo_offer_for_gents extends Gents
{
	public void comboOfferGents()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Offer1");
		System.out.println("Enter 2 for Offer2");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Offer1");
			System.out.println("This offer consists of: Hair_cut+Beard_styling+Hair_spa");
			d.Final_Details(1000, "365days");
			break;
		case 2:
			System.out.println("Thank You For Choosing Offer2");
			System.out.println("This offer consists of: Hair_cut+Beard_styling+Hair_massage");
			d.Final_Details(1000, "365days");
			break;
		default:
			System.out.println("Invalid Input");
			this.comboOfferGents();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.comboOfferGents();
		}
	}
}

class Ladies extends Unissalon
{
	public void ladies()
	{
		Unissalon Un1=new Hair_Styling();
		Hair_Styling hs=(Hair_Styling)Un1;

		Unissalon Un2=new Make_Up();
		Make_Up mu=(Make_Up)Un2;

		Unissalon Un3=new Hair_Texture_Ladies();
		Hair_Texture_Ladies htl=(Hair_Texture_Ladies)Un3;

		Unissalon Un4=new Hair_Treatment_Ladies();
		Hair_Treatment_Ladies htrl=(Hair_Treatment_Ladies)Un4;

		Unissalon Un5=new Facials_Rituals();
		Facials_Rituals fr=(Facials_Rituals)Un5;

		Unissalon Un6=new Hand_Feet();
		Hand_Feet hf=(Hand_Feet)Un6;

		Unissalon Un7=new Nail_care();
		Nail_care nc=(Nail_care)Un7;

		Unissalon Un8=new combo_offer_for_ladies();
		combo_offer_for_ladies cofl=(combo_offer_for_ladies)Un8;

		Scanner a = new Scanner(System.in);
		System.out.println("Enter 1 for Hair_Styling");
		System.out.println("Enter 2 for Make_Up");
		System.out.println("Enter 3 for Hair_Texture_Ladies");
		System.out.println("Enter 4 for Hair_Treatment_Ladies");
		System.out.println("Enter 5 for Facials_Rituals");
		System.out.println("Enter 6 for Hand_Feet");
		System.out.println("Enter 7 for Nail_care");
		System.out.println("Enter 8 for combo_offer_for_ladies");

		try {
		int opt = a.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Your choice is Hair_Styling");
			hs.hairStyling();
			break;
		case 2:
			System.out.println("Your choice is Make_Up");
			mu.makeUp();
			break;
		case 3:
			System.out.println("Your choice is Hair_Texture_Ladies");
			htl.hairTextureLadies();
			break;
		case 4:
			System.out.println("Your choice is Hair_Treatment_Ladies");
			htrl.hairTreatmentLadies();
			break;
		case 5:
			System.out.println("Your choice is Facials_Rituals");
			fr.facialsRituals();
			break;
		case 6:
			System.out.println("Your choice is Hand_Feet");
			hf.handFeet();
			break;
		case 7:
			System.out.println("Your choice is Nail_care");
			nc.nailCare();
			break;
		case 8:
			System.out.println("Your choice is combo_offer_for_ladies");
			cofl.comboOfferLadies();
			break;
		default:
			System.out.println("Invalid Input");
			this.ladies();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.ladies();
		}
	}
}

class Hair_Styling extends Ladies
{
	public void hairStyling()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Hair_cut");
		System.out.println("Enter 2 for Ironing");
		System.out.println("Enter 3 for Global_coloring");
		System.out.println("Enter 4 for Blow_dry");
		System.out.println("Enter 5 for Root_touch_up");
		System.out.println("Enter 6 for Roller_setting");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Hair_cut");
			System.out.println("Any hair style cutting+sampoo&conditioning+head massage");
			d.Final_Details(500, "Any style");
			break;
		case 2:
			System.out.println("Thank You For Choosing Ironing");
			d.Final_Details(100, "");
			break;
		case 3:
			System.out.println("Thank You For Choosing Global_coloring");
			System.out.println("Any hair color+sampoo&conditioning");
			d.Final_Details(1000, "Any color");
			break;
		case 4:
			System.out.println("Thank You For Choosing Blow_dry");
			System.out.println("Hair Setting");
			d.Final_Details(100, "");
			break;
		case 5:
			System.out.println("Thank You For Choosing Root_touch_up");
			System.out.println("Hair color to the roots of hair");
			d.Final_Details(1000, "");
			break;
		case 6:
			System.out.println("Thank You For Choosing Roller_setting");
			System.out.println("Type of Hair styling method");
			d.Final_Details(300, "wet set");
			break;
		default:
			System.out.println("Invalid Input");
			this.hairStyling();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.hairStyling();
		}
	}
}

class Make_Up extends Ladies
{
	public void makeUp()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Party_makeup");
		System.out.println("Enter 2 for Engagement_makeup");
		System.out.println("Enter 3 for Bridal&Reception_makeup");
		System.out.println("Enter 4 for Base_makeup");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Party_makeup");
			System.out.println("Total 10 persons");
			d.Final_Details(10000, "for 10 people");
			break;
		case 2:
			System.out.println("Thank You For Choosing Engagement_makeup");
			System.out.println("Total 15 persons — Special makeup for both couples");
			d.Final_Details(20000, "for 15 people");
			break;
		case 3:
			System.out.println("Thank You For Choosing Bridal&Reception_makeup");
			System.out.println("Total 20 persons — Special makeup for Bride and Groom");
			d.Final_Details(35000, "for 20 people");
			break;
		case 4:
			System.out.println("Thank You For Choosing Base_makeup");
			d.Final_Details(1000, "Normal");
			break;
		default:
			System.out.println("Invalid Input");
			this.makeUp();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.makeUp();
		}
	}
}

class Hair_Texture_Ladies extends Ladies
{
	public void hairTextureLadies()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Rebonding");
		System.out.println("Enter 2 for Keratin");
		System.out.println("Enter 3 for Smoothening");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Rebonding");
			d.Final_Details(1000, "");
			break;
		case 2:
			System.out.println("Thank You For Choosing Keratin");
			d.Final_Details(2000, "");
			break;
		case 3:
			System.out.println("Thank You For Choosing Smoothening");
			d.Final_Details(3500, "");
			break;
		default:
			System.out.println("Invalid Input");
			this.hairTextureLadies();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.hairTextureLadies();
		}
	}
}

class Hair_Treatment_Ladies extends Ladies
{
	public void hairTreatmentLadies()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Spa_treatment");
		System.out.println("Enter 2 for Scalp_treatment");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Spa_treatment");
			d.Final_Details(5000, "");
			break;
		case 2:
			System.out.println("Thank You For Choosing Scalp_treatment");
			d.Final_Details(8000, "call us on: 9000000000");
			break;
		default:
			System.out.println("Invalid Input");
			this.hairTreatmentLadies();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.hairTreatmentLadies();
		}
	}
}

class Facials_Rituals extends Ladies
{
	public void facialsRituals()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Bleach");
		System.out.println("Enter 2 for Luxary_Facial_Ritual");
		System.out.println("Enter 3 for clean_up");
		System.out.println("Enter 4 for Threading");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Bleach");
			d.Final_Details(1000, "");
			break;
		case 2:
			System.out.println("Thank You For Choosing Luxary_Facial_Ritual");
			System.out.println("Special treatment");
			d.Final_Details(3000, "");
			break;
		case 3:
			System.out.println("Thank You For Choosing clean_up");
			d.Final_Details(500, "basic");
			break;
		case 4:
			System.out.println("Thank You For Choosing Threading");
			d.Final_Details(300, "");
			break;
		default:
			System.out.println("Invalid Input");
			this.facialsRituals();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.facialsRituals();
		}
	}
}

class Hand_Feet extends Ladies
{
	public void handFeet()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Manicure");
		System.out.println("Enter 2 for Pedicure");
		System.out.println("Enter 3 for Waxing");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Manicure");
			d.Final_Details(1000, "");
			break;
		case 2:
			System.out.println("Thank You For Choosing Pedicure");
			d.Final_Details(1500, "");
			break;
		case 3:
			System.out.println("Thank You For Choosing Waxing");
			d.Final_Details(1000, "");
			break;
		default:
			System.out.println("Invalid Input");
			this.handFeet();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.handFeet();
		}
	}
}

class Nail_care extends Ladies
{
	public void nailCare()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Nail_Paint");
		System.out.println("Enter 2 for Nail_art");
		System.out.println("Enter 3 for Nail_filling");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Nail_Paint");
			d.Final_Details(150, "different type of shades");
			break;
		case 2:
			System.out.println("Thank You For Choosing Nail_art");
			System.out.println("Basic art — Extra charge for self-design");
			d.Final_Details(2000, "Extra charge for self-design");
			break;
		case 3:
			System.out.println("Thank You For Choosing Nail_filling");
			d.Final_Details(3000, "");
			break;
		default:
			System.out.println("Invalid Input");
			this.nailCare();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.nailCare();
		}
	}
}

class combo_offer_for_ladies extends Ladies
{
	public void comboOfferLadies()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Offer1");
		System.out.println("Enter 2 for Offer2");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Thank You For Choosing Offer1");
			System.out.println("This offer consists of: Hair_cut+Global coloring+Keratin");
			d.Final_Details(3000, "365days");
			break;
		case 2:
			System.out.println("Thank You For Choosing Offer2");
			System.out.println("This offer consists of: manicure+Pedicure+Spa_treatments");
			d.Final_Details(7000, "365days");
			break;
		default:
			System.out.println("Invalid Input");
			this.comboOfferLadies();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.comboOfferLadies();
		}
	}
}

class Yearly_Package extends Unissalon
{
	public void yearlyPackage()
	{
		Unissalon Un1=new Male();
		Male m=(Male)Un1;

		Unissalon Un2=new Female();
		Female f=(Female)Un2;

		Scanner a = new Scanner(System.in);
		System.out.println("Enter 1 for Male");
		System.out.println("Enter 2 for Female");

		try {
		int opt = a.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Your choice is male");
			m.male();
			break;
		case 2:
			System.out.println("Your choice is female");
			f.female();
			break;
		default:
			System.out.println("Invalid Input");
			this.yearlyPackage();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.yearlyPackage();
		}
	}
}

class Male extends Yearly_Package
{
	public void male()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Yearly_package1");
		System.out.println("Enter 2 for Yearly_package2");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("6 times hair + 6 times shave + 2 times color + 1 hair spa");
			d.Final_Details(20000, "Yearly");
			break;
		case 2:
			System.out.println("3 times hair + 4 times shave + 1 times color + 1 hair spa + Diamond Facial");
			d.Final_Details(30000, "Yearly");
			break;
		default:
			System.out.println("Invalid Input");
			this.male();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.male();
		}
	}
}

class Female extends Yearly_Package
{
	public void female()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Yearly_package1");
		System.out.println("Enter 2 for Yearly_package2");

		try {
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("3 times hair + 2 times color + 1 hair spa + nail_care");
			d.Final_Details(50000, "Yearly");
			break;
		case 2:
			System.out.println("Hair_cut + Hair_color + manicure + pedicure + waxing + scalp treatment");
			d.Final_Details(60000, "Yearly");
			break;
		default:
			System.out.println("Invalid Input");
			this.female();
			break;
		}
		}catch(InputMismatchException i) {
			System.out.println("Enter valid Input");
			this.female();
		}
	}
}

class BookingLogger {
    private static final String FILE_PATH = "bookings.txt";
    private static ArrayList<String> sessionBookings = new ArrayList<>();

    public static void saveBooking(String name, long contact, String email,
                                   String service, double price) {
        String timestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String record = String.format(
            "[%s] Name: %s | Contact: %d | Email: %s | Service: %s | Price: %.2f",
            timestamp, name, contact, email, service, price);

        sessionBookings.add(record);

        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            pw.println(record);
        } catch (IOException e) {
            System.out.println("Warning: Could not save booking to file.");
        }
        System.out.println("Booking saved to " + FILE_PATH);
    }

    public static void printSessionBookings() {
        System.out.println("\n===== Bookings This Session =====");
        if (sessionBookings.isEmpty()) {
            System.out.println("No bookings recorded.");
        } else {
            sessionBookings.forEach(System.out::println);
        }
        System.out.println("=================================\n");
    }
}

/*class Details
{
	public boolean isValidEmail(String email) {
    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}

	public void Final_Details(double prod_price, String info)
	{
		Unissalon Un=new Unissalon();
		System.out.println("Choose Your Payment Option");
		System.out.println("To Pay With Cash Press 1");
		System.out.println("To Pay With Card Press 2");
		System.out.println("To Pay With UPI Press 3");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Your choice is Cash");
			break;
		case 2:
			System.out.println("Your choice is Card");
			break;
		case 3:
			System.out.println("Your choice is UPI");
			break;
		default:
			System.out.println("Invalid Input");
			break;

		String cusmail = "";
		boolean validEmail = false;

		while (!validEmail) {
    		System.out.println("Enter Your Email Id");
    		sc.nextLine();
    		cusmail = sc.nextLine();

    		if (isValidEmail(cusmail)) {
        		validEmail = true;
        		System.out.println("Email accepted: " + cusmail);
    		} else {
        		System.out.println("Invalid email! Please enter a valid email (e.g. abc@gmail.com)");
    		}
		}
		Un.setCust_email_id(cusmail);
		}

		System.out.println("Enter Your Name");
		sc.nextLine();
		String cusname = sc.nextLine();
		Un.setCust_name(cusname);

		System.out.println("Enter Your Mobile Number");
		Long cuscono = sc.nextLong();
		Un.setCust_contact(cuscono);

		System.out.println("Enter Your Email Id");
		sc.nextLine();
		String cusmail = sc.nextLine();
		Un.setCust_email_id(cusmail);

		Un.A(prod_price, info);
		Un.getDetails();
		System.out.println("Your appointment has been booked. Thank You!");
		System.out.println("Have a great Day!");
		System.out.println("Do visit again");

		Un.feedback();
		BookingLogger.saveBooking(cusname, cuscono, cusmail, info, prod_price);
		BookingLogger.printSessionBookings();
	}
}
*/

class Details
{
    public void Final_Details(double prod_price, String info)
    {
        Unissalon Un = new Unissalon();
        Scanner sc = new Scanner(System.in);

        // Payment selection
        System.out.println("Choose Your Payment Option");
        System.out.println("To Pay With Cash Press 1");
        System.out.println("To Pay With Card Press 2");
        System.out.println("To Pay With UPI Press 3");

        try {
            int opt = sc.nextInt();
            switch (opt) {
            case 1:
                System.out.println("Your choice is Cash");
                break;
            case 2:
                System.out.println("Your choice is Card");
                break;
            case 3:
                System.out.println("Your choice is UPI");
                break;
            default:
                System.out.println("Invalid Input");
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid payment input");
        }

        // Customer details
        System.out.println("Enter Your Name");
        sc.nextLine();
        String cusname = sc.nextLine();
        Un.setCust_name(cusname);

        System.out.println("Enter Your Mobile Number");
        long cuscono = sc.nextLong();
        Un.setCust_contact(cuscono);

        // Email with validation
        String cusmail = "";
        boolean validEmail = false;
        while (!validEmail) {
            System.out.println("Enter Your Email Id");
            sc.nextLine();
            cusmail = sc.nextLine();
            if (isValidEmail(cusmail)) {
                validEmail = true;
                System.out.println("Email accepted!");
            } else {
                System.out.println("Invalid email! Try again (e.g. abc@gmail.com)");
            }
        }
        Un.setCust_email_id(cusmail);

        Un.A(prod_price, info);
        Un.getDetails();
        System.out.println("");
        System.out.println("Your appointment has been booked. Thank You!");
        System.out.println("Have a great Day!");
        System.out.println("Do visit again");
        System.out.println("");

        Un.feedback();
        BookingLogger.saveBooking(cusname, cuscono, cusmail, info, prod_price);
        BookingLogger.printSessionBookings();
    }

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }
}
public class JSalon
{
	public static void main(String[] args)
	{
		Unissalon Us1=new Gents();
		Gents Gn=(Gents)Us1;
		System.out.println("Enter 1 for Gents");

		Unissalon Us2=new Ladies();
		Ladies Ld=(Ladies)Us2;
		System.out.println("Enter 2 for Ladies");

		Unissalon Us3=new Yearly_Package();
		Yearly_Package yp=(Yearly_Package)Us3;
		System.out.println("Enter 3 for Yearly_Package");

		Scanner sc=new Scanner(System.in);
		int a = 0;
		try {
			a = sc.nextInt();
		} catch (InputMismatchException ie) {
			System.out.println("Enter The Valid Input");
		}
		switch (a)
		{
		case 1:
			System.out.println("Your choice is Gents");
			Gn.gents();
			break;
		case 2:
			System.out.println("Your choice is Ladies");
			Ld.ladies();
			break;
		case 3:
			System.out.println("Your choice is Yearly_Package");
			yp.yearlyPackage();
			break;
		default:
			System.out.println("Enter valid Input");
			main(args);
			break;
		}
	}

	static
	{
		System.out.println("Welcome to JSalon");
		System.out.println("Let's not wait for the Perfect Look");
		System.out.println("Book an Appointment Now!");
		System.out.println();
	}
}