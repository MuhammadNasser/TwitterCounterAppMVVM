package com.muhammad.twitterCounterAppMvvm.data.repository;

import android.util.Log;
import com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService;
import com.muhammad.twitterCounterAppMvvm.domain.entities.query.TweetPayload;
import com.muhammad.twitterCounterAppMvvm.domain.entities.remote.TweetResponse;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/muhammad/twitterCounterAppMvvm/data/repository/TwitterRepositoryImpl;", "Lcom/muhammad/twitterCounterAppMvvm/data/repository/TwitterRepository;", "apiService", "Lcom/muhammad/twitterCounterAppMvvm/data/restful/TwitterApiService;", "(Lcom/muhammad/twitterCounterAppMvvm/data/restful/TwitterApiService;)V", "postTweet", "Lcom/muhammad/twitterCounterAppMvvm/domain/entities/remote/TweetResponse;", "accessToken", "", "tweetText", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TwitterRepositoryImpl implements com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService apiService = null;
    
    @javax.inject.Inject()
    public TwitterRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService apiService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object postTweet(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String tweetText, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.muhammad.twitterCounterAppMvvm.domain.entities.remote.TweetResponse> $completion) {
        return null;
    }
}