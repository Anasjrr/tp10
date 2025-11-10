package ma.projet.restclient.api;

import ma.projet.restclient.entities.Compte;
import ma.projet.restclient.entities.CompteList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;


public interface CompteService {


    @GET("api/comptes")
    @Headers("Accept: application/json")
    Call<List<Compte>> getAllCompteJson();


    @GET("api/comptes")
    @Headers("Accept: application/xml")
    Call<CompteList> getAllCompteXml();


    @GET("api/comptes/{id}")
    Call<Compte> getCompteById(@Path("id") Long id);
    @POST("api/comptes")
    Call<Compte> addCompte(@Body Compte compte);
    @DELETE("api/comptes/{id}")
    Call<Void> deleteCompte(@Path("id") Long id);

    @PUT("api/comptes/{id}")
    Call<Compte> updateCompte(@Path("id") Long id, @Body Compte compte);



}