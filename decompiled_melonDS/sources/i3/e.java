package i3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import b4.v2;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements x {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f6623f = true;

    /* renamed from: a  reason: collision with root package name */
    public final b4.x f6624a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6625b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public m3.b f6626c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6627d;

    /* renamed from: e  reason: collision with root package name */
    public final d f6628e;

    /* JADX WARN: Type inference failed for: r0v1, types: [i3.d, android.content.ComponentCallbacks, java.lang.Object] */
    public e(b4.x xVar) {
        this.f6624a = xVar;
        ?? obj = new Object();
        this.f6628e = obj;
        if (xVar.isAttachedToWindow()) {
            Context context = xVar.getContext();
            if (!this.f6627d) {
                context.getApplicationContext().registerComponentCallbacks(obj);
                this.f6627d = true;
            }
        }
        xVar.addOnAttachStateChangeListener(new v2(2, this));
    }

    @Override // i3.x
    public final void a(l3.b bVar) {
        synchronized (this.f6625b) {
            if (!bVar.f8699s) {
                bVar.f8699s = true;
                bVar.b();
            }
        }
    }

    @Override // i3.x
    public final l3.b b() {
        l3.d iVar;
        l3.b bVar;
        synchronized (this.f6625b) {
            try {
                b4.x xVar = this.f6624a;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    xVar.getUniqueDrawingId();
                }
                if (i2 >= 29) {
                    iVar = new l3.g();
                } else if (f6623f) {
                    iVar = new l3.e(this.f6624a, new r(), new k3.b());
                } else {
                    iVar = new l3.i(c(this.f6624a));
                }
                bVar = new l3.b(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m3.b, android.view.View, m3.a, android.view.ViewGroup] */
    public final m3.a c(b4.x xVar) {
        m3.b bVar = this.f6626c;
        if (bVar == null) {
            ?? viewGroup = new ViewGroup(xVar.getContext());
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
            xVar.addView((View) viewGroup, -1);
            this.f6626c = viewGroup;
            return viewGroup;
        }
        return bVar;
    }
}
