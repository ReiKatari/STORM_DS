package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w67  reason: default package */
/* loaded from: classes.dex */
public final class w67 extends x67 {
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

    /* JADX WARN: Type inference failed for: r5v5, types: [v67, y67] */
    public w67(w67 w67Var, eu euVar) {
        y67 y67Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = RecyclerView.A1;
        this.d = RecyclerView.A1;
        this.e = RecyclerView.A1;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = RecyclerView.A1;
        this.i = RecyclerView.A1;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = w67Var.c;
        this.d = w67Var.d;
        this.e = w67Var.e;
        this.f = w67Var.f;
        this.g = w67Var.g;
        this.h = w67Var.h;
        this.i = w67Var.i;
        String str = w67Var.k;
        this.k = str;
        if (str != null) {
            euVar.put(str, this);
        }
        matrix.set(w67Var.j);
        ArrayList arrayList = w67Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof w67) {
                this.b.add(new w67((w67) obj, euVar));
            } else {
                if (obj instanceof v67) {
                    v67 v67Var = (v67) obj;
                    ?? y67Var2 = new y67(v67Var);
                    y67Var2.e = RecyclerView.A1;
                    y67Var2.g = 1.0f;
                    y67Var2.h = 1.0f;
                    y67Var2.i = RecyclerView.A1;
                    y67Var2.j = 1.0f;
                    y67Var2.k = RecyclerView.A1;
                    y67Var2.l = Paint.Cap.BUTT;
                    y67Var2.m = Paint.Join.MITER;
                    y67Var2.n = 4.0f;
                    y67Var2.d = v67Var.d;
                    y67Var2.e = v67Var.e;
                    y67Var2.g = v67Var.g;
                    y67Var2.f = v67Var.f;
                    y67Var2.c = v67Var.c;
                    y67Var2.h = v67Var.h;
                    y67Var2.i = v67Var.i;
                    y67Var2.j = v67Var.j;
                    y67Var2.k = v67Var.k;
                    y67Var2.l = v67Var.l;
                    y67Var2.m = v67Var.m;
                    y67Var2.n = v67Var.n;
                    y67Var = y67Var2;
                } else if (obj instanceof u67) {
                    y67Var = new y67((u67) obj);
                } else {
                    i.n("Unknown object in the tree!");
                    throw null;
                }
                this.b.add(y67Var);
                Object obj2 = y67Var.b;
                if (obj2 != null) {
                    euVar.put(obj2, y67Var);
                }
            }
        }
    }

    @Override // defpackage.x67
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((x67) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.x67
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                z |= ((x67) arrayList.get(i)).b(iArr);
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
        matrix.postRotate(this.c, RecyclerView.A1, RecyclerView.A1);
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

    public w67() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = RecyclerView.A1;
        this.d = RecyclerView.A1;
        this.e = RecyclerView.A1;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = RecyclerView.A1;
        this.i = RecyclerView.A1;
        this.j = new Matrix();
        this.k = null;
    }
}
