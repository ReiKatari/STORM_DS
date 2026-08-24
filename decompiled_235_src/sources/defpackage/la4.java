package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la4  reason: default package */
/* loaded from: classes.dex */
public final class la4 extends dm5 implements eo2 {
    public rr2 L;
    public ma4 R;
    public long[] X;
    public int Y;
    public int Z;
    public int d0;
    public int e0;
    public long f0;
    public int g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ ma4 i0;
    public final /* synthetic */ rr2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la4(ma4 ma4Var, rr2 rr2Var, r41 r41Var) {
        super(2, r41Var);
        this.i0 = ma4Var;
        this.j0 = rr2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((la4) q((r41) obj2, (rb6) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        la4 la4Var = new la4(this.i0, this.j0, r41Var);
        la4Var.h0 = obj;
        return la4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:23:0x00a1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        rb6 rb6Var;
        ma4 ma4Var;
        long[] jArr;
        int length;
        rr2 rr2Var;
        int i;
        long j;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.g0;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.e0;
                int i4 = this.d0;
                long j2 = this.f0;
                int i5 = this.Z;
                int i6 = this.Y;
                long[] jArr2 = this.X;
                ma4 ma4Var2 = this.R;
                rr2 rr2Var2 = this.L;
                rb6 rb6Var2 = (rb6) this.h0;
                oi2.Y(obj);
                j2 >>= 8;
                i3++;
                if (i3 < i4) {
                    if (i4 == 8) {
                        length = i6;
                        jArr = jArr2;
                        ma4Var = ma4Var2;
                        rb6Var = rb6Var2;
                        i = i5;
                        rr2Var = rr2Var2;
                        if (i != length) {
                            i++;
                            j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                rb6Var2 = rb6Var;
                                i3 = 0;
                                ma4Var2 = ma4Var;
                                jArr2 = jArr;
                                i4 = 8 - ((~(i - length)) >>> 31);
                                rr2Var2 = rr2Var;
                                i5 = i;
                                i6 = length;
                                j2 = j;
                                if (i3 < i4) {
                                    if ((255 & j2) < 128) {
                                        int i7 = (i5 << 3) + i3;
                                        rr2Var2.B = i7;
                                        Object obj2 = ma4Var2.B.b[i7];
                                        this.h0 = rb6Var2;
                                        this.L = rr2Var2;
                                        this.R = ma4Var2;
                                        this.X = jArr2;
                                        this.Y = i6;
                                        this.Z = i5;
                                        this.f0 = j2;
                                        this.d0 = i4;
                                        this.e0 = i3;
                                        this.g0 = 1;
                                        if (rb6Var2.c(this, obj2) == x61Var) {
                                            return x61Var;
                                        }
                                    }
                                    j2 >>= 8;
                                    i3++;
                                    if (i3 < i4) {
                                    }
                                }
                            }
                            if (i != length) {
                            }
                        }
                    }
                    return jg7.a;
                }
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            rb6Var = (rb6) this.h0;
            ma4Var = this.i0;
            jArr = ma4Var.B.a;
            length = jArr.length - 2;
            if (length >= 0) {
                rr2Var = this.j0;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return jg7.a;
        }
    }
}
