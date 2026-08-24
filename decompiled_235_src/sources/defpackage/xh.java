package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh  reason: default package */
/* loaded from: classes.dex */
public final class xh implements tt2 {
    public static boolean f = true;
    public final te a;
    public final Object b = new Object();
    public po7 c;
    public boolean d;
    public final vh e;

    /* JADX WARN: Type inference failed for: r0v1, types: [vh, android.content.ComponentCallbacks, java.lang.Object] */
    public xh(te teVar) {
        this.a = teVar;
        ?? obj = new Object();
        this.e = obj;
        if (teVar.isAttachedToWindow()) {
            Context context = teVar.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(obj);
                this.d = true;
            }
        }
        teVar.addOnAttachStateChangeListener(new wh(this, 0));
    }

    @Override // defpackage.tt2
    public final void a(ut2 ut2Var) {
        synchronized (this.b) {
            if (!ut2Var.s) {
                ut2Var.s = true;
                ut2Var.b();
            }
        }
    }

    @Override // defpackage.tt2
    public final ut2 b() {
        wt2 du2Var;
        wt2 wt2Var;
        ut2 ut2Var;
        synchronized (this.b) {
            try {
                te teVar = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    teVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    wt2Var = new bu2();
                } else {
                    if (f) {
                        du2Var = new zt2(this.a, new ak0(), new zj0());
                    } else {
                        du2Var = new du2(c(this.a));
                    }
                    wt2Var = du2Var;
                }
                ut2Var = new ut2(wt2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ut2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, po7, ko1, android.view.ViewGroup] */
    public final ko1 c(te teVar) {
        po7 po7Var = this.c;
        if (po7Var == null) {
            ?? viewGroup = new ViewGroup(teVar.getContext());
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
            teVar.addView((View) viewGroup, -1);
            this.c = viewGroup;
            return viewGroup;
        }
        return po7Var;
    }
}
