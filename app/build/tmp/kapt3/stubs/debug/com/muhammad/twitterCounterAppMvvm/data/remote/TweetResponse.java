package com.muhammad.twitterCounterAppMvvm.data.remote;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/muhammad/twitterCounterAppMvvm/data/remote/TweetResponse;", "", "createdAt", "", "id", "", "idStr", "text", "user", "Lcom/muhammad/twitterCounterAppMvvm/data/remote/TwitterUser;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/muhammad/twitterCounterAppMvvm/data/remote/TwitterUser;)V", "getCreatedAt", "()Ljava/lang/String;", "getId", "()J", "getIdStr", "getText", "getUser", "()Lcom/muhammad/twitterCounterAppMvvm/data/remote/TwitterUser;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class TweetResponse {
    @com.google.gson.annotations.SerializedName(value = "created_at")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final long id = 0L;
    @com.google.gson.annotations.SerializedName(value = "id_str")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idStr = null;
    @com.google.gson.annotations.SerializedName(value = "text")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String text = null;
    @com.google.gson.annotations.SerializedName(value = "user")
    @org.jetbrains.annotations.NotNull()
    private final com.muhammad.twitterCounterAppMvvm.data.remote.TwitterUser user = null;
    
    public TweetResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String idStr, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    com.muhammad.twitterCounterAppMvvm.data.remote.TwitterUser user) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.muhammad.twitterCounterAppMvvm.data.remote.TwitterUser getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.muhammad.twitterCounterAppMvvm.data.remote.TwitterUser component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.muhammad.twitterCounterAppMvvm.data.remote.TweetResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String idStr, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    com.muhammad.twitterCounterAppMvvm.data.remote.TwitterUser user) {
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}