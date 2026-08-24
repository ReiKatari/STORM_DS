package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tz4  reason: default package */
/* loaded from: classes.dex */
public class tz4 {
    public final Object[] a;
    public int b;

    public tz4(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            i.h("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(yu yuVar) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = yuVar;
            this.b = i + 1;
        }
    }

    public boolean c(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 < i) {
                if (objArr[i2] != obj) {
                    i2++;
                } else {
                    i.m("Already in the pool!");
                    return false;
                }
            } else {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
        }
    }

    public tz4() {
        this.a = new Object[256];
    }
}
