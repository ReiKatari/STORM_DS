package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.Toast;
import com.stormds.emulator.R;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw4  reason: default package */
/* loaded from: classes.dex */
public final class sw4 {
    public static final ow4 i = new ow4(Looper.getMainLooper(), 0);
    public final List a;
    public final Context b;
    public final uk1 c;
    public final s63 d;
    public final pq6 e;
    public final WeakHashMap f;
    public final WeakHashMap g;
    public final ReferenceQueue h;

    public sw4(Context context, uk1 uk1Var, s63 s63Var, pq6 pq6Var) {
        this.b = context;
        this.c = uk1Var;
        this.d = s63Var;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new a41(context, 1));
        arrayList.add(new f31(context));
        arrayList.add(new m34(context, 0));
        arrayList.add(new a41(context, 0));
        arrayList.add(new rv(context));
        arrayList.add(new m34(context, 1));
        arrayList.add(new ff4((ss2) uk1Var.e, pq6Var));
        this.a = Collections.unmodifiableList(arrayList);
        this.e = pq6Var;
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.h = referenceQueue;
        new pw4(referenceQueue, i).start();
    }

    public final void a(Object obj) {
        StringBuilder sb = ck7.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            i33 i33Var = (i33) this.f.remove(obj);
            if (i33Var != null) {
                i33Var.g = true;
                if (i33Var.h != null) {
                    i33Var.h = null;
                }
                sk1 sk1Var = (sk1) this.c.j;
                sk1Var.sendMessage(sk1Var.obtainMessage(2, i33Var));
            }
            if (obj instanceof ImageView) {
                xg6.A(this.g.remove((ImageView) obj));
                return;
            }
            return;
        }
        i.m("Method call should happen from the main thread.");
    }

    public final void b(Bitmap bitmap, qw4 qw4Var, i33 i33Var, Exception exc) {
        boolean z = i33Var.g;
        p7 p7Var = i33Var.c;
        if (z) {
            return;
        }
        if (!i33Var.f) {
            this.f.remove(i33Var.a());
        }
        if (bitmap != null) {
            if (qw4Var != null) {
                ImageView imageView = (ImageView) p7Var.get();
                if (imageView != null) {
                    Context context = i33Var.a.b;
                    int i2 = tw4.e;
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).stop();
                    }
                    imageView.setImageDrawable(new tw4(context, bitmap, drawable, qw4Var));
                    yc1 yc1Var = i33Var.h;
                    if (yc1Var != null) {
                        yc1Var.I();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        ImageView imageView2 = (ImageView) p7Var.get();
        if (imageView2 != null) {
            Drawable drawable2 = imageView2.getDrawable();
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
            yc1 yc1Var2 = i33Var.h;
            if (yc1Var2 != null) {
                if (exc != null) {
                    exc.printStackTrace();
                }
                Toast.makeText(((b) yc1Var2.A).getContext(), (int) R.string.layout_background_load_failed, 1).show();
            }
        }
    }

    public final void c(i33 i33Var) {
        Object a = i33Var.a();
        if (a != null) {
            WeakHashMap weakHashMap = this.f;
            if (weakHashMap.get(a) != i33Var) {
                a(a);
                weakHashMap.put(a, i33Var);
            }
        }
        sk1 sk1Var = (sk1) this.c.j;
        sk1Var.sendMessage(sk1Var.obtainMessage(1, i33Var));
    }
}
