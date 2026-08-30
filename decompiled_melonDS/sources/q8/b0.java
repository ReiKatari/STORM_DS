package q8;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import g2.z1;
import java.util.ArrayList;
import p8.e0;
import q.q3;
import u1.l1;
import zc.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final x8.p f12324a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f12325b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12326c;

    /* renamed from: d  reason: collision with root package name */
    public final z8.a f12327d;

    /* renamed from: e  reason: collision with root package name */
    public final p8.b f12328e;

    /* renamed from: f  reason: collision with root package name */
    public final p8.x f12329f;

    /* renamed from: g  reason: collision with root package name */
    public final d f12330g;

    /* renamed from: h  reason: collision with root package name */
    public final WorkDatabase f12331h;

    /* renamed from: i  reason: collision with root package name */
    public final x8.u f12332i;

    /* renamed from: j  reason: collision with root package name */
    public final x8.b f12333j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f12334k;

    /* renamed from: l  reason: collision with root package name */
    public final String f12335l;
    public final a1 m;

    public b0(q3 q3Var) {
        x8.p pVar = (x8.p) q3Var.f11999f;
        this.f12324a = pVar;
        this.f12325b = (Context) q3Var.f11994a;
        String str = pVar.f14420a;
        this.f12326c = str;
        this.f12327d = (z8.a) q3Var.f11996c;
        p8.b bVar = (p8.b) q3Var.f11995b;
        this.f12328e = bVar;
        this.f12329f = bVar.f11455d;
        this.f12330g = (d) q3Var.f11997d;
        WorkDatabase workDatabase = (WorkDatabase) q3Var.f11998e;
        this.f12331h = workDatabase;
        this.f12332i = workDatabase.w();
        this.f12333j = workDatabase.r();
        ArrayList arrayList = (ArrayList) q3Var.f12000g;
        this.f12334k = arrayList;
        this.f12335l = w.d.s(w.d.u("Work [ id=", str, ", tags={ "), zb.l.Y(arrayList, ",", null, null, null, 62), " } ]");
        this.m = zc.x.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:37:0x009d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static final java.lang.Object a(q8.b0 r23, ec.c r24) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.b0.a(q8.b0, ec.c):java.lang.Object");
    }

    public final void b(int i2) {
        e0 e0Var = e0.ENQUEUED;
        x8.u uVar = this.f12332i;
        String str = this.f12326c;
        uVar.h(e0Var, str);
        this.f12329f.getClass();
        uVar.g(System.currentTimeMillis(), str);
        uVar.f(this.f12324a.f14440v, str);
        uVar.e(-1L, str);
        uVar.i(i2, str);
    }

    public final void c() {
        this.f12329f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        x8.u uVar = this.f12332i;
        String str = this.f12326c;
        uVar.g(currentTimeMillis, str);
        uVar.h(e0.ENQUEUED, str);
        k7.t tVar = uVar.f14444a;
        ((Number) r.K(tVar, false, true, new z1(str, 16))).intValue();
        uVar.f(this.f12324a.f14440v, str);
        r.K(tVar, false, true, new z1(str, 17));
        uVar.e(-1L, str);
    }

    public final void d(p8.t tVar) {
        tVar.getClass();
        String str = this.f12326c;
        ArrayList A = p7.t.A(str);
        while (true) {
            boolean isEmpty = A.isEmpty();
            x8.u uVar = this.f12332i;
            if (!isEmpty) {
                String str2 = (String) zb.l.h0(A);
                if (uVar.c(str2) != e0.CANCELLED) {
                    uVar.h(e0.FAILED, str2);
                }
                A.addAll(this.f12333j.a(str2));
            } else {
                p8.h hVar = ((p8.q) tVar).f11501a;
                hVar.getClass();
                uVar.f(this.f12324a.f14440v, str);
                r.K(uVar.f14444a, false, true, new l1(10, hVar, str));
                return;
            }
        }
    }
}
