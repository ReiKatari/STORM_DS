package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pq4  reason: default package */
/* loaded from: classes.dex */
public class pq4 {
    public final Object[] a;
    public int b;

    public pq4(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            i.i("The max pool size must be > 0");
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

    public void b(gu guVar) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = guVar;
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
                    i.n("Already in the pool!");
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

    public pq4() {
        this.a = new Object[256];
    }
}
