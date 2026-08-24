package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk7  reason: default package */
/* loaded from: classes.dex */
public final class vk7 extends wk7 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Type inference failed for: r5v5, types: [uk7, xk7] */
    public vk7(vk7 vk7Var, wu wuVar) {
        xk7 xk7Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = RecyclerView.B1;
        this.d = RecyclerView.B1;
        this.e = RecyclerView.B1;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = RecyclerView.B1;
        this.i = RecyclerView.B1;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = vk7Var.c;
        this.d = vk7Var.d;
        this.e = vk7Var.e;
        this.f = vk7Var.f;
        this.g = vk7Var.g;
        this.h = vk7Var.h;
        this.i = vk7Var.i;
        String str = vk7Var.k;
        this.k = str;
        if (str != null) {
            wuVar.put(str, this);
        }
        matrix.set(vk7Var.j);
        ArrayList arrayList = vk7Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof vk7) {
                this.b.add(new vk7((vk7) obj, wuVar));
            } else {
                if (obj instanceof uk7) {
                    uk7 uk7Var = (uk7) obj;
                    ?? xk7Var2 = new xk7(uk7Var);
                    xk7Var2.e = RecyclerView.B1;
                    xk7Var2.g = 1.0f;
                    xk7Var2.h = 1.0f;
                    xk7Var2.i = RecyclerView.B1;
                    xk7Var2.j = 1.0f;
                    xk7Var2.k = RecyclerView.B1;
                    xk7Var2.l = Paint.Cap.BUTT;
                    xk7Var2.m = Paint.Join.MITER;
                    xk7Var2.n = 4.0f;
                    xk7Var2.d = uk7Var.d;
                    xk7Var2.e = uk7Var.e;
                    xk7Var2.g = uk7Var.g;
                    xk7Var2.f = uk7Var.f;
                    xk7Var2.c = uk7Var.c;
                    xk7Var2.h = uk7Var.h;
                    xk7Var2.i = uk7Var.i;
                    xk7Var2.j = uk7Var.j;
                    xk7Var2.k = uk7Var.k;
                    xk7Var2.l = uk7Var.l;
                    xk7Var2.m = uk7Var.m;
                    xk7Var2.n = uk7Var.n;
                    xk7Var = xk7Var2;
                } else if (obj instanceof tk7) {
                    xk7Var = new xk7((tk7) obj);
                } else {
                    i.m("Unknown object in the tree!");
                    throw null;
                }
                this.b.add(xk7Var);
                Object obj2 = xk7Var.b;
                if (obj2 != null) {
                    wuVar.put(obj2, xk7Var);
                }
            }
        }
    }

    @Override // defpackage.wk7
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((wk7) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.wk7
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                z |= ((wk7) arrayList.get(i)).b(iArr);
                i++;
            } else {
                return z;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, RecyclerView.B1, RecyclerView.B1);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public vk7() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = RecyclerView.B1;
        this.d = RecyclerView.B1;
        this.e = RecyclerView.B1;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = RecyclerView.B1;
        this.i = RecyclerView.B1;
        this.j = new Matrix();
        this.k = null;
    }
}
