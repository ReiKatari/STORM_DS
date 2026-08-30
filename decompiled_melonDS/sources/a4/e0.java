package a4;

import android.util.Size;
import java.util.Comparator;
import java.util.Date;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f192a;

    public /* synthetic */ e0(int i2) {
        this.f192a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f192a) {
            case 0:
                o0 o0Var = (o0) obj;
                o0 o0Var2 = (o0) obj2;
                float f8 = o0Var.B0.f348p.f243y0;
                float f10 = o0Var2.B0.f348p.f243y0;
                if (f8 == f10) {
                    return nc.k.b(o0Var.v(), o0Var2.v());
                }
                return Float.compare(f8, f10);
            case DSiCameraSource.FrontCamera /* 1 */:
                ze.a aVar = (ze.a) obj;
                ze.a aVar2 = (ze.a) obj2;
                aVar.getClass();
                aVar2.getClass();
                Date date = aVar.f15059g;
                if (date == null) {
                    return -1;
                }
                Date date2 = aVar2.f15059g;
                if (date2 == null) {
                    return 1;
                }
                return date.compareTo(date2);
            case 2:
                ze.a aVar3 = (ze.a) obj;
                ze.a aVar4 = (ze.a) obj2;
                aVar3.getClass();
                aVar4.getClass();
                Date date3 = aVar4.f15059g;
                if (date3 == null) {
                    return -1;
                }
                Date date4 = aVar3.f15059g;
                if (date4 == null) {
                    return 1;
                }
                return date3.compareTo(date4);
            case 3:
                ze.a aVar5 = (ze.a) obj;
                ze.a aVar6 = (ze.a) obj2;
                aVar5.getClass();
                aVar6.getClass();
                return aVar5.f15053a.compareTo(aVar6.f15053a);
            case 4:
                ze.a aVar7 = (ze.a) obj;
                ze.a aVar8 = (ze.a) obj2;
                aVar7.getClass();
                aVar8.getClass();
                return aVar8.f15053a.compareTo(aVar7.f15053a);
            case l1.c.f8511g /* 5 */:
                return ((j0.g) obj).f7200a.compareTo(((j0.g) obj2).f7200a);
            case l1.c.f8509e /* 6 */:
                yb.j jVar = (yb.j) obj;
                yb.j jVar2 = (yb.j) obj2;
                return (((Number) jVar.B).intValue() - ((Number) jVar.A).intValue()) - (((Number) jVar2.B).intValue() - ((Number) jVar2.A).intValue());
            case 7:
                return nc.k.b(((n2.n0) obj).f9959b, ((n2.n0) obj2).f9959b);
            case 8:
                return nc.k.b(((p1.g1) obj2).f11210a, ((p1.g1) obj).f11210a);
            case l1.c.f8508d /* 9 */:
                return nc.k.b(((p1.g0) obj).getIndex(), ((p1.g0) obj2).getIndex());
            case l1.c.f8510f /* 10 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b10 = bArr[i2];
                    byte b11 = bArr2[i2];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 11:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            default:
                y5.a aVar9 = (y5.a) obj;
                y5.a aVar10 = (y5.a) obj2;
                int i10 = aVar9.f14778c;
                int i11 = aVar10.f14778c;
                if (i10 < i11) {
                    return -1;
                }
                if (i10 > i11) {
                    return 1;
                }
                return Integer.compare(aVar10.f14779d, aVar9.f14779d);
        }
    }
}
