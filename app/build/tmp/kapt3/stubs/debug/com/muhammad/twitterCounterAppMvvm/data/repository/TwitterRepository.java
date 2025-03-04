package com.muhammad.twitterCounterAppMvvm.data.repository;

import com.muhammad.twitterCounterAppMvvm.domain.entities.remote.TweetResponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/muhammad/twitterCounterAppMvvm/data/repository/TwitterRepository;", "", "postTweet", "Lcom/muhammad/twitterCounterAppMvvm/domain/entities/remote/TweetResponse;", "accessToken", "", "tweetText", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TwitterRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object postTweet(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String tweetText, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.muhammad.twitterCounterAppMvvm.domain.entities.remote.TweetResponse> $completion);
}