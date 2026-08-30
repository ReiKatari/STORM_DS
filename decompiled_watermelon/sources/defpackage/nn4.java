package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.Toast;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nn4  reason: default package */
/* loaded from: classes.dex */
public final class nn4 {
    public static final jn4 i = new jn4(Looper.getMainLooper(), 0);
    public final List a;
    public final Context b;
    public final qg1 c;
    public final ka3 d;
    public final af6 e;
    public final WeakHashMap f;
    public final WeakHashMap g;
    public final ReferenceQueue h;

    public nn4(Context context, qg1 qg1Var, ka3 ka3Var, af6 af6Var) {
        this.b = context;
        this.c = qg1Var;
        this.d = ka3Var;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new t01(context, 1));
        arrayList.add(new a01(context));
        arrayList.add(new bw3(context, 0));
        arrayList.add(new t01(context, 0));
        arrayList.add(new zu(context));
        arrayList.add(new bw3(context, 1));
        arrayList.add(new q64((ka3) qg1Var.e, af6Var));
        this.a = Collections.unmodifiableList(arrayList);
        this.e = af6Var;
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.h = referenceQueue;
        new kn4(referenceQueue, i).start();
    }

    public final void a(Object obj) {
        StringBuilder sb = e67.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ex2 ex2Var = (ex2) this.f.remove(obj);
            if (ex2Var != null) {
                ex2Var.g = true;
                if (ex2Var.h != null) {
                    ex2Var.h = null;
                }
                og1 og1Var = (og1) this.c.j;
                og1Var.sendMessage(og1Var.obtainMessage(2, ex2Var));
            }
            if (obj instanceof ImageView) {
                ej6.j(this.g.remove((ImageView) obj));
                return;
            }
            return;
        }
        i.n("Method call should happen from the main thread.");
    }

    public final void b(Bitmap bitmap, ln4 ln4Var, ex2 ex2Var, Exception exc) {
        boolean z = ex2Var.g;
        o7 o7Var = ex2Var.c;
        if (z) {
            return;
        }
        if (!ex2Var.f) {
            this.f.remove(ex2Var.a());
        }
        if (bitmap != null) {
            if (ln4Var != null) {
                ImageView imageView = (ImageView) o7Var.get();
                if (imageView != null) {
                    Context context = ex2Var.a.b;
                    int i2 = on4.e;
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).stop();
                    }
                    imageView.setImageDrawable(new on4(context, bitmap, drawable, ln4Var));
                    k91 k91Var = ex2Var.h;
                    if (k91Var != null) {
                        k91Var.J();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        ImageView imageView2 = (ImageView) o7Var.get();
        if (imageView2 != null) {
            Drawable drawable2 = imageView2.getDrawable();
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
            k91 k91Var2 = ex2Var.h;
            if (k91Var2 != null) {
                if (exc != null) {
                    exc.printStackTrace();
                }
                Toast.makeText(((b) k91Var2.A).getContext(), (int) R.string.layout_background_load_failed, 1).show();
            }
        }
    }

    public final void c(ex2 ex2Var) {
        Object a = ex2Var.a();
        if (a != null) {
            WeakHashMap weakHashMap = this.f;
            if (weakHashMap.get(a) != ex2Var) {
                a(a);
                weakHashMap.put(a, ex2Var);
            }
        }
        og1 og1Var = (og1) this.c.j;
        og1Var.sendMessage(og1Var.obtainMessage(1, ex2Var));
    }
}
