package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: i  reason: collision with root package name */
    public static final w f3181i = new w(Looper.getMainLooper(), 0);

    /* renamed from: a  reason: collision with root package name */
    public final List f3182a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3183b;

    /* renamed from: c  reason: collision with root package name */
    public final m f3184c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.b f3185d;

    /* renamed from: e  reason: collision with root package name */
    public final g0 f3186e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap f3187f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakHashMap f3188g;

    /* renamed from: h  reason: collision with root package name */
    public final ReferenceQueue f3189h;

    public a0(Context context, m mVar, a0.b bVar, g0 g0Var) {
        this.f3183b = context;
        this.f3184c = mVar;
        this.f3185d = bVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new h(context, 1));
        arrayList.add(new g(context));
        arrayList.add(new q(context, 0));
        arrayList.add(new h(context, 0));
        arrayList.add(new b(context));
        arrayList.add(new q(context, 1));
        arrayList.add(new v((a0.b) mVar.f3256e, g0Var));
        this.f3182a = Collections.unmodifiableList(arrayList);
        this.f3186e = g0Var;
        this.f3187f = new WeakHashMap();
        this.f3188g = new WeakHashMap();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f3189h = referenceQueue;
        new x(referenceQueue, f3181i).start();
    }

    public final void a(Object obj) {
        StringBuilder sb2 = k0.f3247a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            n nVar = (n) this.f3187f.remove(obj);
            if (nVar != null) {
                nVar.f3271g = true;
                if (nVar.f3272h != null) {
                    nVar.f3272h = null;
                }
                j jVar = (j) this.f3184c.f3261j;
                jVar.sendMessage(jVar.obtainMessage(2, nVar));
            }
            if (obj instanceof ImageView) {
                w.d.A(this.f3188g.remove((ImageView) obj));
                return;
            }
            return;
        }
        a0.j.p("Method call should happen from the main thread.");
    }

    public final void b(Bitmap bitmap, y yVar, n nVar, Exception exc) {
        boolean z10 = nVar.f3271g;
        a aVar = nVar.f3267c;
        if (z10) {
            return;
        }
        if (!nVar.f3270f) {
            this.f3187f.remove(nVar.a());
        }
        if (bitmap != null) {
            if (yVar != null) {
                ImageView imageView = (ImageView) aVar.get();
                if (imageView != null) {
                    Context context = nVar.f3265a.f3183b;
                    int i2 = b0.f3193e;
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).stop();
                    }
                    imageView.setImageDrawable(new b0(context, bitmap, drawable, yVar));
                    f fVar = nVar.f3272h;
                    if (fVar != null) {
                        fVar.k();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        ImageView imageView2 = (ImageView) aVar.get();
        if (imageView2 != null) {
            Drawable drawable2 = imageView2.getDrawable();
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
            f fVar2 = nVar.f3272h;
            if (fVar2 != null) {
                fVar2.g(exc);
            }
        }
    }

    public final void c(n nVar) {
        Object a10 = nVar.a();
        if (a10 != null) {
            WeakHashMap weakHashMap = this.f3187f;
            if (weakHashMap.get(a10) != nVar) {
                a(a10);
                weakHashMap.put(a10, nVar);
            }
        }
        j jVar = (j) this.f3184c.f3261j;
        jVar.sendMessage(jVar.obtainMessage(1, nVar));
    }
}
