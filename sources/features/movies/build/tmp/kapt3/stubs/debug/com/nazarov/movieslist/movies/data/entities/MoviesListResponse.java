package com.nazarov.movieslist.movies.data.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\u0005\u00a2\u0006\u0002\u0010$J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\tH\u00c6\u0003J\t\u0010I\u001a\u00020\u0014H\u00c6\u0003J\t\u0010J\u001a\u00020\tH\u00c6\u0003J\t\u0010K\u001a\u00020\tH\u00c6\u0003J\t\u0010L\u001a\u00020\u0018H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u001bH\u00c6\u0003J\t\u0010O\u001a\u00020\tH\u00c6\u0003J\t\u0010P\u001a\u00020\tH\u00c6\u0003J\t\u0010Q\u001a\u00020\tH\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\tH\u00c6\u0003J\t\u0010U\u001a\u00020\"H\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0007H\u00c6\u0003J\t\u0010X\u001a\u00020\tH\u00c6\u0003J\t\u0010Y\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u00c6\u0003J\t\u0010[\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0010H\u00c6\u0003J\t\u0010]\u001a\u00020\tH\u00c6\u0003J\u00f5\u0001\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010c\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0015\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0011\u0010\u0016\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001c\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0011\u0010\u001d\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010,R\u0011\u0010\u001e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0011\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0011\u0010 \u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010#\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010(\u00a8\u0006d"}, d2 = {"Lcom/nazarov/movieslist/movies/data/entities/MoviesListResponse;", "", "_links", "Lcom/nazarov/movieslist/movies/data/entities/Links;", "averageRuntime", "", "dvdCountry", "Lcom/nazarov/movieslist/movies/data/entities/DvdCountry;", "ended", "", "externals", "Lcom/nazarov/movieslist/movies/data/entities/Externals;", "genres", "", "id", "image", "Lcom/nazarov/movieslist/movies/data/entities/Image;", "language", "name", "network", "Lcom/nazarov/movieslist/movies/data/entities/Network;", "officialSite", "premiered", "rating", "Lcom/nazarov/movieslist/movies/data/entities/Rating;", "runtime", "schedule", "Lcom/nazarov/movieslist/movies/data/entities/Schedule;", "status", "summary", "type", "updated", "url", "webChannel", "Lcom/nazarov/movieslist/movies/data/entities/WebChannel;", "weight", "(Lcom/nazarov/movieslist/movies/data/entities/Links;ILcom/nazarov/movieslist/movies/data/entities/DvdCountry;Ljava/lang/String;Lcom/nazarov/movieslist/movies/data/entities/Externals;Ljava/util/List;ILcom/nazarov/movieslist/movies/data/entities/Image;Ljava/lang/String;Ljava/lang/String;Lcom/nazarov/movieslist/movies/data/entities/Network;Ljava/lang/String;Ljava/lang/String;Lcom/nazarov/movieslist/movies/data/entities/Rating;ILcom/nazarov/movieslist/movies/data/entities/Schedule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/nazarov/movieslist/movies/data/entities/WebChannel;I)V", "get_links", "()Lcom/nazarov/movieslist/movies/data/entities/Links;", "getAverageRuntime", "()I", "getDvdCountry", "()Lcom/nazarov/movieslist/movies/data/entities/DvdCountry;", "getEnded", "()Ljava/lang/String;", "getExternals", "()Lcom/nazarov/movieslist/movies/data/entities/Externals;", "getGenres", "()Ljava/util/List;", "getId", "getImage", "()Lcom/nazarov/movieslist/movies/data/entities/Image;", "getLanguage", "getName", "getNetwork", "()Lcom/nazarov/movieslist/movies/data/entities/Network;", "getOfficialSite", "getPremiered", "getRating", "()Lcom/nazarov/movieslist/movies/data/entities/Rating;", "getRuntime", "getSchedule", "()Lcom/nazarov/movieslist/movies/data/entities/Schedule;", "getStatus", "getSummary", "getType", "getUpdated", "getUrl", "getWebChannel", "()Lcom/nazarov/movieslist/movies/data/entities/WebChannel;", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "movies_debug"})
public final class MoviesListResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.nazarov.movieslist.movies.data.entities.Links _links = null;
    private final int averageRuntime = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.nazarov.movieslist.movies.data.entities.DvdCountry dvdCountry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ended = null;
    @org.jetbrains.annotations.NotNull()
    private final com.nazarov.movieslist.movies.data.entities.Externals externals = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> genres = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.nazarov.movieslist.movies.data.entities.Image image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String language = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final com.nazarov.movieslist.movies.data.entities.Network network = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String officialSite = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String premiered = null;
    @org.jetbrains.annotations.NotNull()
    private final com.nazarov.movieslist.movies.data.entities.Rating rating = null;
    private final int runtime = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.nazarov.movieslist.movies.data.entities.Schedule schedule = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String summary = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    private final int updated = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final com.nazarov.movieslist.movies.data.entities.WebChannel webChannel = null;
    private final int weight = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.MoviesListResponse copy(@org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Links _links, int averageRuntime, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.DvdCountry dvdCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String ended, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Externals externals, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> genres, int id, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Image image, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Network network, @org.jetbrains.annotations.NotNull()
    java.lang.String officialSite, @org.jetbrains.annotations.NotNull()
    java.lang.String premiered, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Rating rating, int runtime, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Schedule schedule, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int updated, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.WebChannel webChannel, int weight) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MoviesListResponse(@org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Links _links, int averageRuntime, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.DvdCountry dvdCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String ended, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Externals externals, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> genres, int id, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Image image, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Network network, @org.jetbrains.annotations.NotNull()
    java.lang.String officialSite, @org.jetbrains.annotations.NotNull()
    java.lang.String premiered, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Rating rating, int runtime, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.Schedule schedule, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int updated, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.nazarov.movieslist.movies.data.entities.WebChannel webChannel, int weight) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Links component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Links get_links() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAverageRuntime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.DvdCountry component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.DvdCountry getDvdCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Externals component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Externals getExternals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGenres() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Image component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Image getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Network component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Network getNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOfficialSite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPremiered() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Rating component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Rating getRating() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getRuntime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Schedule component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.Schedule getSchedule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int getUpdated() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.WebChannel component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nazarov.movieslist.movies.data.entities.WebChannel getWebChannel() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getWeight() {
        return 0;
    }
}