package com.muhammad.twitterCounterAppMvvm.ui;

import androidx.lifecycle.ViewModel;
import com.muhammad.twitterCounterAppMvvm.core.TweetState;
import com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository;
import com.muhammad.twitterCounterAppMvvm.domain.CalculateTweetLengthUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/muhammad/twitterCounterAppMvvm/ui/TweetViewModel;", "Landroidx/lifecycle/ViewModel;", "twitterRepository", "Lcom/muhammad/twitterCounterAppMvvm/data/repository/TwitterRepository;", "(Lcom/muhammad/twitterCounterAppMvvm/data/repository/TwitterRepository;)V", "_charCount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_tweetStatus", "Lcom/muhammad/twitterCounterAppMvvm/core/TweetState;", "_tweetText", "", "charCount", "Lkotlinx/coroutines/flow/StateFlow;", "getCharCount", "()Lkotlinx/coroutines/flow/StateFlow;", "tweetStatus", "getTweetStatus", "tweetText", "getTweetText", "onTweetTextChanged", "", "newText", "postTweet", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TweetViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository twitterRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _tweetText = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> tweetText = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _charCount = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> charCount = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.muhammad.twitterCounterAppMvvm.core.TweetState> _tweetStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.muhammad.twitterCounterAppMvvm.core.TweetState> tweetStatus = null;
    
    @javax.inject.Inject()
    public TweetViewModel(@org.jetbrains.annotations.NotNull()
    com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository twitterRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getTweetText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getCharCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.muhammad.twitterCounterAppMvvm.core.TweetState> getTweetStatus() {
        return null;
    }
    
    public final void onTweetTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String newText) {
    }
    
    public final void postTweet() {
    }
}