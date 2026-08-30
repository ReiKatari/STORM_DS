package v1;

import a1.h0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import l4.q0;
import mc.l;
import u1.h1;
import x1.d;
import x1.f;
import x1.g;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f13609a = new h1(4);

    /* renamed from: b  reason: collision with root package name */
    public static final a f13610b = new a(0);

    public static final void a(w1.a aVar, Context context, final boolean z10, final String str, final long j2) {
        if (!q0.c(j2) && str.length() != 0) {
            PackageManager packageManager = context.getPackageManager();
            final Context context2 = context;
            List list = (List) f13609a.k(context2);
            if (!list.isEmpty()) {
                h0 h0Var = aVar.f14111a;
                h0 h0Var2 = aVar.f14111a;
                f fVar = f.f14333b;
                h0Var.a(fVar);
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    final ResolveInfo resolveInfo = (ResolveInfo) list.get(i2);
                    h0Var2.a(new d(new x1.a(i2), resolveInfo.loadLabel(packageManager).toString(), 0, new l() { // from class: v1.c
                        @Override // mc.l
                        public final Object k(Object obj) {
                            b.f13610b.l(context2, resolveInfo, Boolean.valueOf(z10), str, new q0(j2));
                            ((g) obj).close();
                            return y.f14813a;
                        }
                    }));
                    i2++;
                    context2 = context;
                }
                h0Var2.a(fVar);
            }
        }
    }
}
