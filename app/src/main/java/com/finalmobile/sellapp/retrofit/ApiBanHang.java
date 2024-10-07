package com.finalmobile.sellapp.retrofit;

import io.reactivex.rxjava3.core.Observable;
import com.finalmobile.sellapp.model.LoaiSpModel;
import retrofit2.http.GET;

public interface ApiBanHang {
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaiSp();
}
