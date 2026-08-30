package ek;

import f2.s;
import java.util.Arrays;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.h2;
import nc.u;
import o2.j0;
import v2.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4505a;

    /* renamed from: b  reason: collision with root package name */
    public int f4506b;

    /* renamed from: c  reason: collision with root package name */
    public int f4507c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i2, (i11 & 2) != 0 ? 0 : i10);
        this.f4505a = 1;
    }

    public static final void e(short[] sArr) {
        Arrays.fill(sArr, (short) 1024);
    }

    public int a(short[] sArr, int i2) {
        f();
        short s10 = sArr[i2];
        int i10 = (this.f4506b >>> 11) * s10;
        if (Integer.compare(this.f4507c ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i10) < 0) {
            this.f4506b = i10;
            sArr[i2] = (short) (s10 + ((2048 - s10) >>> 5));
            return 0;
        }
        this.f4506b -= i10;
        this.f4507c -= i10;
        sArr[i2] = (short) (s10 - (s10 >>> 5));
        return 1;
    }

    public int b(short[] sArr) {
        int i2 = 1;
        do {
            i2 = a(sArr, i2) | (i2 << 1);
        } while (i2 < sArr.length);
        return i2 - sArr.length;
    }

    public abstract void c(s sVar, n2.c cVar, h2 h2Var, i iVar, j0 j0Var);

    public n2.a d(s sVar) {
        return null;
    }

    public abstract void f();

    public String toString() {
        switch (this.f4505a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                String c4 = u.a(getClass()).c();
                if (c4 == null) {
                    return "";
                }
                return c4;
            default:
                return super.toString();
        }
    }

    public a(int i2, int i10) {
        this.f4505a = 1;
        this.f4506b = i2;
        this.f4507c = i10;
    }

    public a() {
        this.f4505a = 0;
        this.f4506b = 0;
        this.f4507c = 0;
    }
}
