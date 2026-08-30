package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s44  reason: default package */
/* loaded from: classes.dex */
public final class s44 extends nk6 implements aj2 {
    public final /* synthetic */ kx6 X;
    public final /* synthetic */ l44 Y;
    public final /* synthetic */ l34 Z;
    public final /* synthetic */ r14 c0;
    public final /* synthetic */ ae6 d0;
    public final /* synthetic */ yt0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s44(kx6 kx6Var, l44 l44Var, l34 l34Var, r14 r14Var, ae6 ae6Var, yt0 yt0Var, j11 j11Var) {
        super(2, j11Var);
        this.X = kx6Var;
        this.Y = l44Var;
        this.Z = l34Var;
        this.c0 = r14Var;
        this.d0 = ae6Var;
        this.e0 = yt0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        o27 o27Var = o27.a;
        ((s44) t((j11) obj2, (o31) obj)).v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new s44(this.X, this.Y, this.Z, this.c0, this.d0, this.e0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        kx6 kx6Var = this.X;
        Object f = kx6Var.a.f();
        tj4 tj4Var = kx6Var.d;
        if (b53.x(f, tj4Var.getValue()) && (((l34) this.Y.b.f.l()) == null || b53.x(tj4Var.getValue(), this.Z))) {
            for (l34 l34Var : (List) this.d0.getValue()) {
                this.e0.b().c(l34Var);
            }
            r14 r14Var = this.c0;
            long[] jArr = r14Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = r14Var.b[i4];
                                float f2 = r14Var.c[i4];
                                if (!b53.x((String) obj2, ((l34) tj4Var.getValue()).Y)) {
                                    r14Var.e--;
                                    long[] jArr2 = r14Var.a;
                                    int i5 = r14Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    r14Var.b[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return o27.a;
    }
}
