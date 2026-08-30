package b4;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k3 {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f1874a = new LinkedHashMap();

    public static final cd.o1 a(Context context) {
        cd.o1 o1Var;
        zc.w wVar;
        LinkedHashMap linkedHashMap = f1874a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    bd.h s10 = ij.a.s(-1, 6, null);
                    cd.z0 z0Var = new cd.z0(new i3(contentResolver, uriFor, new j3(s10, p7.t.f(Looper.getMainLooper())), s10, context, null));
                    zc.m1 c4 = zc.x.c();
                    gd.f fVar = zc.g0.f15015a;
                    ah.h0 h0Var = new ah.h0(pc.a.G(c4, ed.n.f4465a));
                    cd.n1 n1Var = new cd.n1(0L, Long.MAX_VALUE);
                    Float valueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    cd.h1 k10 = cd.q.k(z0Var, 1);
                    cd.q1 c10 = cd.q.c(valueOf);
                    cc.g gVar = (cc.g) k10.R;
                    cd.h hVar = (cd.h) k10.B;
                    if (n1Var.equals(cd.i1.f2832a)) {
                        wVar = zc.w.DEFAULT;
                    } else {
                        wVar = zc.w.UNDISPATCHED;
                    }
                    zc.x.u(h0Var, gVar, wVar, new a9.d(n1Var, hVar, c10, valueOf, (cc.c) null));
                    obj = new cd.y0(c10);
                    linkedHashMap.put(context, obj);
                }
                o1Var = (cd.o1) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o1Var;
    }

    public static final n2.v b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof n2.v) {
            return (n2.v) tag;
        }
        return null;
    }
}
