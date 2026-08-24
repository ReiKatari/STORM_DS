package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zac implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;
    private final Bitmap zac;
    private final CountDownLatch zad;

    public zac(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Object obj;
        HashSet hashSet;
        ArrayList arrayList;
        Map map2;
        zz7 zz7Var;
        Map map3;
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        map = this.zaa.zai;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.remove(this.zab);
        if (imageReceiver != null) {
            arrayList = imageReceiver.zac;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zag zagVar = (zag) arrayList.get(i);
                Bitmap bitmap = this.zac;
                ImageManager imageManager = this.zaa;
                if (bitmap != null) {
                    zagVar.zac(imageManager.zad, bitmap, false);
                } else {
                    Uri uri = this.zab;
                    map2 = imageManager.zaj;
                    map2.put(uri, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager2 = this.zaa;
                    Context context = imageManager2.zad;
                    zz7Var = imageManager2.zag;
                    zagVar.zab(context, zz7Var, false);
                }
                if (!(zagVar instanceof zaf)) {
                    map3 = this.zaa.zah;
                    map3.remove(zagVar);
                }
            }
        }
        this.zad.countDown();
        obj = ImageManager.zaa;
        synchronized (obj) {
            hashSet = ImageManager.zab;
            hashSet.remove(this.zab);
        }
    }
}
