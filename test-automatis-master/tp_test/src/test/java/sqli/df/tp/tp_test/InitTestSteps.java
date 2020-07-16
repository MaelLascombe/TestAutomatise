package sqli.df.tp.tp_test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InitTestSteps {
	private Bar bar;
	private Boolean test;

	@Given("^un bar à (\\d+) places$")
	public void un_bar_à_places(int arg1) throws Throwable {
		bar = new Bar(arg1);
	}
	
	@Given("^le bar à déjà (\\d+) places d'occupées$")
	public void le_bar_à_déjà_places_d_occupées(int arg1) throws Throwable {
		List<Personne> list = new ArrayList<Personne>();
		for (int i=0; i<arg1;i++)
			list.add(new Personne("Personne"+i));
	    bar.setOccupation(list);
	}
	
	@When("^un groupe de personne rentre$")
	public void un_groupe_de_personne_rentre(List<String> arg1) throws Throwable {
		List<Personne> list = new ArrayList<Personne>();
		for (int i=0; i<arg1.size();i++) {
			list.add(new Personne(arg1.get(i)));
		}
	    test = bar.isItFull(list);
	}
	
	@Then("^ils se font refuser à l'entrée$")
	public void ils_se_font_refuser_à_l_entrée() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(test);
	}
	
	@Then("^la personne derrière eux se voit refuser l'entrée car le bar affiche complet$")
	public void la_personne_derrière_eux_se_voit_refuser_l_entrée_car_le_bar_affiche_complet() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(bar.getFull());
	}
	
	@When("^les personnes ci dessous commandent chacuns un bon coktail à (\\d+)$")
	public void les_personnes_ci_dessous_commandent_chacuns_un_bon_coktail_à(int price, List<String> arg2) throws Throwable {
	    for (int i = 0; i < arg2.size(); i++) {
	    	bar.getClientByName(arg2.get(i)).addDrink(price);
	    }
	}
	
	@Then("^ils vérifient la note de (\\d+)$")
	public void ils_vérifient_la_note_de_et_Mr_Pignon_paie(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, (bar.getClientByName("Mr Pignon").getNote() + bar.getClientByName("Mr Leblanc").getNote()));
	}
	
	@When("^Mr Pignon paie$")
	public void mr_Pignon_paie() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(bar.getClientByName("Mr Pignon").paid());
	}

	@Then("^Mr Pignon est heureux de n'avoir commandé qu'un verre$")
	public void mr_Pignon_est_heureux_de_n_avoir_commandé_qu_un_verre() throws Throwable {
	    Assert.assertTrue(bar.getClientByName("Mr Pignon").isMrPignonHappy());
	}
	

	@Then("^ils s'assoient\\.$")
	public void ils_s_assoient() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertFalse(test);
	}
	
	@Then("^ils vérifient chacun leurs notes de (\\d+)\\.$")
	public void ils_vérifient_chacun_leurs_notes_de(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(arg1, bar.getClientByName("Mr Pignon").getNote());
	    Assert.assertEquals(arg1, bar.getClientByName("Mr Leblanc").getNote());
	}
	
	@Then("^Mr Leblanc leurs commandent (\\d+) autres cocktails du mois à (\\d+)$")
	public void mr_Leblanc_commandent_autres_cocktails_du_mois_à(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 bar.getClientByName("Mr Leblanc").offerDrink(arg2);
		 bar.getClientByName("Mr Leblanc").addDrink(arg2);
		 bar.getClientByName("Mr Pignon").haveFreeDrink();
	}
	
	@When("^Mr Leblanc vérifie sa note de (\\d+)$")
	public void mr_Pignon_vérifie_sa_note_de(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, bar.getClientByName("Mr Leblanc").getNote());
	}
	
	@Then("^Mr Leblanc paye$")
	public void mr_leblanc_paye() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(bar.getClientByName("Mr Leblanc").paid());
	}
	
	@Then("^Mr Pignon est triste d'avoir bu plus d'un verre$")
	public void mr_Pignon_est_triste_d_avoir_bu_plus_d_un_verre() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(bar.getClientByName("Mr Pignon").isMrPignonHappy());
	}

	
}
