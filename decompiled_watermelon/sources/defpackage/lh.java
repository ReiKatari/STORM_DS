package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lh  reason: default package */
/* loaded from: classes.dex */
public final class lh implements on2 {
    public static boolean f = true;
    public final ee a;
    public final Object b = new Object();
    public pa7 c;
    public boolean d;
    public final jh e;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.ComponentCallbacks, java.lang.Object, jh] */
    public lh(ee eeVar) {
        this.a = eeVar;
        ?? obj = new Object();
        this.e = obj;
        if (eeVar.isAttachedToWindow()) {
            Context context = eeVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(obj);
                this.d = true;
            }
        }
        eeVar.addOnAttachStateChangeListener(new kh(0, this));
    }

    @Override // defpackage.on2
    public final void a(pn2 pn2Var) {
        synchronized (this.b) {
            if (!pn2Var.s) {
                pn2Var.s = true;
                pn2Var.b();
            }
        }
    }

    @Override // defpackage.on2
    public final pn2 b() {
        rn2 zn2Var;
        rn2 rn2Var;
        pn2 pn2Var;
        synchronized (this.b) {
            try {
                ee eeVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    eeVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    rn2Var = new xn2();
                } else {
                    if (f) {
                        zn2Var = new vn2(this.a, new sh0(), new rh0());
                    } else {
                        zn2Var = new zn2(c(this.a));
                    }
                    rn2Var = zn2Var;
                }
                pn2Var = new pn2(rn2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pn2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [pa7, android.view.View, ek1, android.view.ViewGroup] */
    public final ek1 c(ee eeVar) {
        pa7 pa7Var = this.c;
        if (pa7Var == null) {
            ?? viewGroup = new ViewGroup(eeVar.getContext());
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
            eeVar.addView((View) viewGroup, -1);
            this.c = viewGroup;
            return viewGroup;
        }
        return pa7Var;
    }
}
