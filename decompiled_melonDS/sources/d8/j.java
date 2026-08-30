package d8;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f3968a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3969b;

    /* renamed from: c  reason: collision with root package name */
    public float f3970c;

    /* renamed from: d  reason: collision with root package name */
    public float f3971d;

    /* renamed from: e  reason: collision with root package name */
    public float f3972e;

    /* renamed from: f  reason: collision with root package name */
    public float f3973f;

    /* renamed from: g  reason: collision with root package name */
    public float f3974g;

    /* renamed from: h  reason: collision with root package name */
    public float f3975h;

    /* renamed from: i  reason: collision with root package name */
    public float f3976i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f3977j;

    /* renamed from: k  reason: collision with root package name */
    public String f3978k;

    /* JADX WARN: Type inference failed for: r4v5, types: [d8.i, d8.l] */
    public j(j jVar, a1.e eVar) {
        l lVar;
        this.f3968a = new Matrix();
        this.f3969b = new ArrayList();
        this.f3970c = 0.0f;
        this.f3971d = 0.0f;
        this.f3972e = 0.0f;
        this.f3973f = 1.0f;
        this.f3974g = 1.0f;
        this.f3975h = 0.0f;
        this.f3976i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3977j = matrix;
        this.f3978k = null;
        this.f3970c = jVar.f3970c;
        this.f3971d = jVar.f3971d;
        this.f3972e = jVar.f3972e;
        this.f3973f = jVar.f3973f;
        this.f3974g = jVar.f3974g;
        this.f3975h = jVar.f3975h;
        this.f3976i = jVar.f3976i;
        String str = jVar.f3978k;
        this.f3978k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(jVar.f3977j);
        ArrayList arrayList = jVar.f3969b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof j) {
                this.f3969b.add(new j((j) obj, eVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f3959e = 0.0f;
                    lVar2.f3961g = 1.0f;
                    lVar2.f3962h = 1.0f;
                    lVar2.f3963i = 0.0f;
                    lVar2.f3964j = 1.0f;
                    lVar2.f3965k = 0.0f;
                    lVar2.f3966l = Paint.Cap.BUTT;
                    lVar2.m = Paint.Join.MITER;
                    lVar2.f3967n = 4.0f;
                    lVar2.f3958d = iVar.f3958d;
                    lVar2.f3959e = iVar.f3959e;
                    lVar2.f3961g = iVar.f3961g;
                    lVar2.f3960f = iVar.f3960f;
                    lVar2.f3981c = iVar.f3981c;
                    lVar2.f3962h = iVar.f3962h;
                    lVar2.f3963i = iVar.f3963i;
                    lVar2.f3964j = iVar.f3964j;
                    lVar2.f3965k = iVar.f3965k;
                    lVar2.f3966l = iVar.f3966l;
                    lVar2.m = iVar.m;
                    lVar2.f3967n = iVar.f3967n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    a0.j.p("Unknown object in the tree!");
                    throw null;
                }
                this.f3969b.add(lVar);
                Object obj2 = lVar.f3980b;
                if (obj2 != null) {
                    eVar.put(obj2, lVar);
                }
            }
        }
    }

    @Override // d8.k
    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f3969b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // d8.k
    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f3969b;
            if (i2 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i2)).b(iArr);
                i2++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f3977j;
        matrix.reset();
        matrix.postTranslate(-this.f3971d, -this.f3972e);
        matrix.postScale(this.f3973f, this.f3974g);
        matrix.postRotate(this.f3970c, 0.0f, 0.0f);
        matrix.postTranslate(this.f3975h + this.f3971d, this.f3976i + this.f3972e);
    }

    public String getGroupName() {
        return this.f3978k;
    }

    public Matrix getLocalMatrix() {
        return this.f3977j;
    }

    public float getPivotX() {
        return this.f3971d;
    }

    public float getPivotY() {
        return this.f3972e;
    }

    public float getRotation() {
        return this.f3970c;
    }

    public float getScaleX() {
        return this.f3973f;
    }

    public float getScaleY() {
        return this.f3974g;
    }

    public float getTranslateX() {
        return this.f3975h;
    }

    public float getTranslateY() {
        return this.f3976i;
    }

    public void setPivotX(float f8) {
        if (f8 != this.f3971d) {
            this.f3971d = f8;
            c();
        }
    }

    public void setPivotY(float f8) {
        if (f8 != this.f3972e) {
            this.f3972e = f8;
            c();
        }
    }

    public void setRotation(float f8) {
        if (f8 != this.f3970c) {
            this.f3970c = f8;
            c();
        }
    }

    public void setScaleX(float f8) {
        if (f8 != this.f3973f) {
            this.f3973f = f8;
            c();
        }
    }

    public void setScaleY(float f8) {
        if (f8 != this.f3974g) {
            this.f3974g = f8;
            c();
        }
    }

    public void setTranslateX(float f8) {
        if (f8 != this.f3975h) {
            this.f3975h = f8;
            c();
        }
    }

    public void setTranslateY(float f8) {
        if (f8 != this.f3976i) {
            this.f3976i = f8;
            c();
        }
    }

    public j() {
        this.f3968a = new Matrix();
        this.f3969b = new ArrayList();
        this.f3970c = 0.0f;
        this.f3971d = 0.0f;
        this.f3972e = 0.0f;
        this.f3973f = 1.0f;
        this.f3974g = 1.0f;
        this.f3975h = 0.0f;
        this.f3976i = 0.0f;
        this.f3977j = new Matrix();
        this.f3978k = null;
    }
}
