package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qk5  reason: default package */
/* loaded from: classes.dex */
public final class qk5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public Object Y;
    public int Z;
    public /* synthetic */ Object c0;
    public Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk5(pc pcVar, k24 k24Var, k24 k24Var2, k24 k24Var3, j11 j11Var) {
        super(2, j11Var);
        this.X = 4;
        this.Y = pcVar;
        this.e0 = k24Var;
        this.c0 = k24Var2;
        this.d0 = k24Var3;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((qk5) t((j11) obj2, (mu4) obj)).v(o27Var);
            case 1:
                return ((qk5) t((j11) obj2, (mu4) obj)).v(o27Var);
            case 2:
                return ((qk5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 3:
                return ((qk5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 4:
                return ((qk5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 5:
                return ((qk5) t((j11) obj2, (o31) obj)).v(o27Var);
            case ig7.b /* 6 */:
                return ((qk5) t((j11) obj2, (w92) obj)).v(o27Var);
            case 7:
                return ((qk5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 8:
                return ((qk5) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((qk5) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                qk5 qk5Var = new qk5((RomDetailsActivity) this.d0, (k24) obj2, j11Var, 0);
                qk5Var.c0 = obj;
                return qk5Var;
            case 1:
                qk5 qk5Var2 = new qk5((RomDetailsActivity) this.d0, (rg5) obj2, j11Var, 1);
                qk5Var2.c0 = obj;
                return qk5Var2;
            case 2:
                qk5 qk5Var3 = new qk5((sq5) this.Y, (ih0) this.d0, (i51) obj2, j11Var, 2);
                qk5Var3.c0 = obj;
                return qk5Var3;
            case 3:
                qk5 qk5Var4 = new qk5((mi2) this.Y, (AtomicReference) this.d0, (aj2) obj2, j11Var, 3);
                qk5Var4.c0 = obj;
                return qk5Var4;
            case 4:
                return new qk5((pc) this.Y, (k24) obj2, (k24) this.c0, (k24) this.d0, j11Var);
            case 5:
                qk5 qk5Var5 = new qk5((mw6) obj2, j11Var);
                qk5Var5.c0 = obj;
                return qk5Var5;
            case ig7.b /* 6 */:
                qk5 qk5Var6 = new qk5((sy6) this.Y, (int[]) this.d0, (String[]) obj2, j11Var, 6);
                qk5Var6.c0 = obj;
                return qk5Var6;
            case 7:
                return new qk5((t47) this.Y, (m47) this.c0, (Map) this.d0, (bw0) obj2, j11Var, 7);
            case 8:
                return new qk5((n75) this.Y, (s55) this.c0, (fn3) this.d0, (tg7) obj2, j11Var, 8);
            default:
                return new qk5((mq3) this.Y, (xh7) this.c0, (fh7) this.d0, (Context) obj2, j11Var, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0209, code lost:
        if (r8.r(r9, r24) != r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r4 == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x035b, code lost:
        if (defpackage.ln2.u(r4, r24) == r2) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
        if (r2 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
        if (((defpackage.ic1) r2).F(r24) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d8, code lost:
        if (r8 == r7) goto L109;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0225 A[Catch: all -> 0x0237, TryCatch #5 {all -> 0x0237, blocks: (B:109:0x0221, B:111:0x0225, B:113:0x0233, B:116:0x0239, B:118:0x023e, B:120:0x0242), top: B:271:0x0221 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
    /* JADX WARN: Type inference failed for: r0v20, types: [j11] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, n75] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x02bd -> B:141:0x0287). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk5.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk5(mw6 mw6Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 5;
        this.e0 = mw6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk5(Object obj, Object obj2, Object obj3, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = obj;
        this.d0 = obj2;
        this.e0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk5(Object obj, Object obj2, Object obj3, Object obj4, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = obj;
        this.c0 = obj2;
        this.d0 = obj3;
        this.e0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk5(RomDetailsActivity romDetailsActivity, Object obj, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.d0 = romDetailsActivity;
        this.e0 = obj;
    }
}
