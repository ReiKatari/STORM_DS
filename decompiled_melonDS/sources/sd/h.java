package sd;

import android.content.Context;
import androidx.preference.Preference;
import cd.e1;
import cd.q;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12871a;

    /* renamed from: b  reason: collision with root package name */
    public final e1 f12872b = q.b(0, Preference.DEFAULT_ORDER, null, 4);

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f12873c = new LinkedHashMap();

    public h(Context context) {
        this.f12871a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, ec.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof sd.g
            if (r0 == 0) goto L13
            r0 = r10
            sd.g r0 = (sd.g) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            sd.g r0 = new sd.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            android.content.Context r4 = r8.f12871a
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2c
            java.lang.String r9 = r0.R
            p7.j.I(r10)
            goto L68
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L33:
            p7.j.I(r10)
            int r10 = aj.g.k(r4, r9)
            if (r10 != 0) goto L3d
            goto L70
        L3d:
            java.util.LinkedHashMap r10 = r8.f12873c
            java.lang.Object r2 = r10.get(r9)
            if (r2 != 0) goto L4e
            bd.a r2 = bd.a.DROP_OLDEST
            cd.e1 r2 = cd.q.a(r3, r5, r2)
            r10.put(r9, r2)
        L4e:
            cd.w0 r2 = (cd.w0) r2
            mh.m r10 = new mh.m
            r6 = 0
            r7 = 10
            r10.<init>(r8, r9, r6, r7)
            cd.v1 r6 = new cd.v1
            r6.<init>(r2, r10)
            r0.R = r9
            r0.Z = r5
            java.lang.Object r10 = cd.q.q(r6, r0)
            if (r10 != r1) goto L68
            return r1
        L68:
            int r9 = aj.g.k(r4, r9)
            if (r9 != 0) goto L6f
            r3 = r5
        L6f:
            r5 = r3
        L70:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.h.a(java.lang.String, ec.c):java.lang.Object");
    }
}
