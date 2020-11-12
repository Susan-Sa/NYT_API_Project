package com.nytsusan.NYT_Susan;

//https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=yourkey
//arts, home, science, us, world

//ArrayList<Dog> dogs = new ArrayList<>(Arrays.asList(dog1, dog2, dog3, dog4, dog5));

import java.util.ArrayList;
import java.util.List;

public class NYTTopStories {

    private String status;
    private String copyright;
    private String section;
    private String last_updated;
    private int num_results;
    private ArrayList<Results> results = new ArrayList<Results>();

//    public NYTTopStories(){
//        this.status = "Value";
//        this.copyright = "Value";
//        this.section = "Value";
//        this.last_updated = "Value";
//        this.num_results = 0;
//        Results result1 = new Results();
//        results.add(result1);
//        //this.results = null;
//    }
    public NYTTopStories() {
        this.status = null;
        this.copyright = null;
        this.section = null;
        this.last_updated = null;
        this.num_results = 0;
        setResults();
        //this.results = null;
    }

//    public NYTTopStories(String status, String copyright, String section, String last_updated, int num_results, List<Results> results) {
//        this.status = status;
//        this.copyright = copyright;
//        this.section = section;
//        this.last_updated = last_updated;
//        this.num_results = num_results;
//        this.results = results;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public List<Results> getResults() {

        return results;
    }

    public void setResults() {
        Results results1 = new Results();
        results.add(results1);
        //this.results = results;
    }
}
