package c5;

import a0.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2604a;

    /* renamed from: b  reason: collision with root package name */
    public int f2605b;

    public d(int i2) {
        if (i2 > 0) {
            this.f2604a = new Object[i2];
        } else {
            j.h("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i2 = this.f2605b;
        if (i2 <= 0) {
            return null;
        }
        int i10 = i2 - 1;
        Object[] objArr = this.f2604a;
        Object obj = objArr[i10];
        obj.getClass();
        objArr[i10] = null;
        this.f2605b--;
        return obj;
    }

    public void b(b bVar) {
        int i2 = this.f2605b;
        Object[] objArr = this.f2604a;
        if (i2 < objArr.length) {
            objArr[i2] = bVar;
            this.f2605b = i2 + 1;
        }
    }

    public boolean c(Object obj) {
        obj.getClass();
        int i2 = this.f2605b;
        int i10 = 0;
        while (true) {
            Object[] objArr = this.f2604a;
            if (i10 < i2) {
                if (objArr[i10] != obj) {
                    i10++;
                } else {
                    j.p("Already in the pool!");
                    return false;
                }
            } else {
                int i11 = this.f2605b;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = obj;
                this.f2605b = i11 + 1;
                return true;
            }
        }
    }

    public d() {
        this.f2604a = new Object[256];
    }
}
