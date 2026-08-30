package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ui7  reason: default package */
/* loaded from: classes.dex */
public final class ui7 {
    public final xh7 a;
    public final Context b;
    public final String c;
    public final nh7 d;
    public final ew0 e;
    public final hm1 f;
    public final ku4 g;
    public final WorkDatabase h;
    public final di7 i;
    public final vd1 j;
    public final ArrayList k;
    public final String l;
    public final e63 m;

    public ui7(cw6 cw6Var) {
        xh7 xh7Var = (xh7) cw6Var.f;
        this.a = xh7Var;
        this.b = (Context) cw6Var.a;
        String str = xh7Var.a;
        this.c = str;
        this.d = (nh7) cw6Var.c;
        ew0 ew0Var = (ew0) cw6Var.b;
        this.e = ew0Var;
        this.f = ew0Var.d;
        this.g = (ku4) cw6Var.d;
        WorkDatabase workDatabase = (WorkDatabase) cw6Var.e;
        this.h = workDatabase;
        this.i = workDatabase.w();
        this.j = workDatabase.r();
        ArrayList arrayList = (ArrayList) cw6Var.g;
        this.k = arrayList;
        this.l = b31.q(b31.u("Work [ id=", str, ", tags={ "), tq0.S0(arrayList, ",", null, null, null, 62), " } ]");
        this.m = ln2.h();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:37:0x009e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static final java.lang.Object a(defpackage.ui7 r23, defpackage.k11 r24) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui7.a(ui7, k11):java.lang.Object");
    }

    public final void b(int i) {
        ih7 ih7Var = ih7.ENQUEUED;
        di7 di7Var = this.i;
        String str = this.c;
        di7Var.h(ih7Var, str);
        this.f.getClass();
        di7Var.g(System.currentTimeMillis(), str);
        di7Var.f(this.a.v, str);
        di7Var.e(-1L, str);
        di7Var.i(i, str);
    }

    public final void c() {
        this.f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        di7 di7Var = this.i;
        String str = this.c;
        di7Var.g(currentTimeMillis, str);
        di7Var.h(ih7.ENQUEUED, str);
        sq5 sq5Var = di7Var.a;
        ((Number) mh7.X(sq5Var, false, true, new ok0(str, 20))).intValue();
        di7Var.f(this.a.v, str);
        mh7.X(sq5Var, false, true, new ok0(str, 21));
        di7Var.e(-1L, str);
    }

    public final void d(lq3 lq3Var) {
        lq3Var.getClass();
        String str = this.c;
        ArrayList f0 = l07.f0(str);
        while (true) {
            boolean isEmpty = f0.isEmpty();
            di7 di7Var = this.i;
            if (!isEmpty) {
                String str2 = (String) tq0.b1(f0);
                if (di7Var.c(str2) != ih7.CANCELLED) {
                    di7Var.h(ih7.FAILED, str2);
                }
                f0.addAll(this.j.a(str2));
            } else {
                g81 g81Var = ((iq3) lq3Var).a;
                g81Var.getClass();
                di7Var.f(this.a.v, str);
                mh7.X(di7Var.a, false, true, new h57(7, g81Var, str));
                return;
            }
        }
    }
}
