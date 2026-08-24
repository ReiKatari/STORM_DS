package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import java.util.HashSet;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zab implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final zag zab;

    public zab(ImageManager imageManager, zag zagVar) {
        this.zaa = imageManager;
        this.zab = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        zz7 zz7Var;
        Map map2;
        Map map3;
        Object obj;
        HashSet hashSet;
        HashSet hashSet2;
        Map map4;
        Map map5;
        Map map6;
        zz7 zz7Var2;
        Map map7;
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        map = this.zaa.zah;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.get(this.zab);
        if (imageReceiver != null) {
            ImageManager imageManager = this.zaa;
            zag zagVar = this.zab;
            map7 = imageManager.zah;
            map7.remove(zagVar);
            imageReceiver.zac(this.zab);
        }
        zag zagVar2 = this.zab;
        zad zadVar = zagVar2.zaa;
        Uri uri = zadVar.zaa;
        ImageManager imageManager2 = this.zaa;
        if (uri != null) {
            map2 = imageManager2.zaj;
            Long l = (Long) map2.get(uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    zag zagVar3 = this.zab;
                    ImageManager imageManager3 = this.zaa;
                    Context context = imageManager3.zad;
                    zz7Var2 = imageManager3.zag;
                    zagVar3.zab(context, zz7Var2, true);
                    return;
                }
                ImageManager imageManager4 = this.zaa;
                Uri uri2 = zadVar.zaa;
                map6 = imageManager4.zaj;
                map6.remove(uri2);
            }
            this.zab.zaa(null, false, true, false);
            ImageManager imageManager5 = this.zaa;
            Uri uri3 = zadVar.zaa;
            map3 = imageManager5.zai;
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) map3.get(uri3);
            if (imageReceiver2 == null) {
                ImageManager.ImageReceiver imageReceiver3 = new ImageManager.ImageReceiver(zadVar.zaa);
                ImageManager imageManager6 = this.zaa;
                Uri uri4 = zadVar.zaa;
                map5 = imageManager6.zai;
                map5.put(uri4, imageReceiver3);
                imageReceiver2 = imageReceiver3;
            }
            imageReceiver2.zab(this.zab);
            zag zagVar4 = this.zab;
            if (!(zagVar4 instanceof zaf)) {
                map4 = this.zaa.zah;
                map4.put(zagVar4, imageReceiver2);
            }
            obj = ImageManager.zaa;
            synchronized (obj) {
                try {
                    hashSet = ImageManager.zab;
                    if (!hashSet.contains(zadVar.zaa)) {
                        hashSet2 = ImageManager.zab;
                        hashSet2.add(zadVar.zaa);
                        imageReceiver2.zad();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        Context context2 = imageManager2.zad;
        zz7Var = imageManager2.zag;
        zagVar2.zab(context2, zz7Var, true);
    }
}
