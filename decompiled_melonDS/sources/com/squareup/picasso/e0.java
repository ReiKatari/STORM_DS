package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicInteger f3212c = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final a0 f3213a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.g f3214b;

    public e0(a0 a0Var, Uri uri) {
        this.f3213a = a0Var;
        a0.g gVar = new a0.g(10, false);
        gVar.B = uri;
        this.f3214b = gVar;
    }

    public final void a(ImageView imageView, f fVar) {
        Bitmap bitmap;
        System.nanoTime();
        StringBuilder sb2 = k0.f3247a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            a0.g gVar = this.f3214b;
            Uri uri = (Uri) gVar.B;
            a0 a0Var = this.f3213a;
            if (uri == null) {
                a0Var.a(imageView);
                int i2 = b0.f3193e;
                imageView.setImageDrawable(null);
                if (imageView.getDrawable() instanceof Animatable) {
                    ((Animatable) imageView.getDrawable()).start();
                    return;
                }
                return;
            }
            f3212c.getAndIncrement();
            if (((z) gVar.L) == null) {
                gVar.L = z.NORMAL;
            }
            Uri uri2 = (Uri) gVar.B;
            a4.n nVar = new a4.n(uri2, (z) gVar.L);
            StringBuilder sb3 = k0.f3247a;
            if (uri2 != null) {
                String uri3 = uri2.toString();
                sb3.ensureCapacity(uri3.length() + 50);
                sb3.append(uri3);
            } else {
                sb3.ensureCapacity(50);
                sb3.append(0);
            }
            sb3.append('\n');
            String sb4 = sb3.toString();
            sb3.setLength(0);
            if (r.shouldReadFromMemoryCache(0)) {
                p pVar = (p) ((o) a0Var.f3185d.B).get(sb4);
                if (pVar != null) {
                    bitmap = pVar.f3273a;
                } else {
                    bitmap = null;
                }
                g0 g0Var = a0Var.f3186e;
                if (bitmap != null) {
                    g0Var.f3218b.sendEmptyMessage(0);
                } else {
                    g0Var.f3218b.sendEmptyMessage(1);
                }
                if (bitmap != null) {
                    a0Var.a(imageView);
                    Context context = a0Var.f3183b;
                    y yVar = y.MEMORY;
                    int i10 = b0.f3193e;
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).stop();
                    }
                    imageView.setImageDrawable(new b0(context, bitmap, drawable, yVar));
                    fVar.k();
                    return;
                }
            }
            int i11 = b0.f3193e;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
            }
            a0Var.c(new n(a0Var, imageView, nVar, sb4, fVar));
            return;
        }
        a0.j.p("Method call should happen from the main thread.");
    }
}
