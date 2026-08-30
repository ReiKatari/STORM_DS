package h5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final int f6272a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6273b;

    /* renamed from: c  reason: collision with root package name */
    public int f6274c;

    /* renamed from: d  reason: collision with root package name */
    public int f6275d;

    /* renamed from: e  reason: collision with root package name */
    public int f6276e;

    /* renamed from: f  reason: collision with root package name */
    public String f6277f;

    /* renamed from: g  reason: collision with root package name */
    public int f6278g;

    /* renamed from: h  reason: collision with root package name */
    public int f6279h;

    /* renamed from: i  reason: collision with root package name */
    public final float f6280i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.constraintlayout.motion.widget.b f6281j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f6282k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.c f6283l;
    public final ArrayList m;

    /* renamed from: n  reason: collision with root package name */
    public final int f6284n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6285o;

    /* renamed from: p  reason: collision with root package name */
    public int f6286p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6287q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6288r;

    public z(androidx.constraintlayout.motion.widget.b bVar, Context context, XmlResourceParser xmlResourceParser) {
        this.f6272a = -1;
        this.f6273b = false;
        this.f6274c = -1;
        this.f6275d = -1;
        this.f6276e = 0;
        this.f6277f = null;
        this.f6278g = -1;
        this.f6279h = 400;
        this.f6280i = 0.0f;
        this.f6282k = new ArrayList();
        this.f6283l = null;
        this.m = new ArrayList();
        this.f6284n = 0;
        this.f6285o = false;
        this.f6286p = -1;
        this.f6288r = 0;
        int i2 = bVar.f1118j;
        SparseArray sparseArray = bVar.f1115g;
        this.f6279h = i2;
        this.f6287q = bVar.f1119k;
        this.f6281j = bVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i5.v.f7011t);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 2) {
                this.f6274c = obtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f6274c);
                if ("layout".equals(resourceTypeName)) {
                    i5.q qVar = new i5.q();
                    qVar.j(context, this.f6274c);
                    sparseArray.append(this.f6274c, qVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f6274c = bVar.i(context, this.f6274c);
                }
            } else if (index == 3) {
                this.f6275d = obtainStyledAttributes.getResourceId(index, this.f6275d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f6275d);
                if ("layout".equals(resourceTypeName2)) {
                    i5.q qVar2 = new i5.q();
                    qVar2.j(context, this.f6275d);
                    sparseArray.append(this.f6275d, qVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f6275d = bVar.i(context, this.f6275d);
                }
            } else if (index == 6) {
                int i11 = obtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    this.f6278g = resourceId;
                    if (resourceId != -1) {
                        this.f6276e = -2;
                    }
                } else if (i11 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f6277f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f6278g = obtainStyledAttributes.getResourceId(index, -1);
                            this.f6276e = -2;
                        } else {
                            this.f6276e = -1;
                        }
                    }
                } else {
                    this.f6276e = obtainStyledAttributes.getInteger(index, this.f6276e);
                }
            } else if (index == 4) {
                int i12 = obtainStyledAttributes.getInt(index, this.f6279h);
                this.f6279h = i12;
                if (i12 < 8) {
                    this.f6279h = 8;
                }
            } else if (index == 8) {
                this.f6280i = obtainStyledAttributes.getFloat(index, this.f6280i);
            } else if (index == 1) {
                this.f6284n = obtainStyledAttributes.getInteger(index, this.f6284n);
            } else if (index == 0) {
                this.f6272a = obtainStyledAttributes.getResourceId(index, this.f6272a);
            } else if (index == 9) {
                this.f6285o = obtainStyledAttributes.getBoolean(index, this.f6285o);
            } else if (index == 7) {
                this.f6286p = obtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f6287q = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f6288r = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f6275d == -1) {
            this.f6273b = true;
        }
        obtainStyledAttributes.recycle();
    }

    public z(androidx.constraintlayout.motion.widget.b bVar, int i2) {
        this.f6272a = -1;
        this.f6273b = false;
        this.f6274c = -1;
        this.f6275d = -1;
        this.f6276e = 0;
        this.f6277f = null;
        this.f6278g = -1;
        this.f6279h = 400;
        this.f6280i = 0.0f;
        this.f6282k = new ArrayList();
        this.f6283l = null;
        this.m = new ArrayList();
        this.f6284n = 0;
        this.f6285o = false;
        this.f6286p = -1;
        this.f6287q = 0;
        this.f6288r = 0;
        this.f6272a = -1;
        this.f6281j = bVar;
        this.f6275d = R.id.view_transition;
        this.f6274c = i2;
        this.f6279h = bVar.f1118j;
        this.f6287q = bVar.f1119k;
    }

    public z(androidx.constraintlayout.motion.widget.b bVar, z zVar) {
        this.f6272a = -1;
        this.f6273b = false;
        this.f6274c = -1;
        this.f6275d = -1;
        this.f6276e = 0;
        this.f6277f = null;
        this.f6278g = -1;
        this.f6279h = 400;
        this.f6280i = 0.0f;
        this.f6282k = new ArrayList();
        this.f6283l = null;
        this.m = new ArrayList();
        this.f6284n = 0;
        this.f6285o = false;
        this.f6286p = -1;
        this.f6287q = 0;
        this.f6288r = 0;
        this.f6281j = bVar;
        this.f6279h = bVar.f1118j;
        if (zVar != null) {
            this.f6286p = zVar.f6286p;
            this.f6276e = zVar.f6276e;
            this.f6277f = zVar.f6277f;
            this.f6278g = zVar.f6278g;
            this.f6279h = zVar.f6279h;
            this.f6282k = zVar.f6282k;
            this.f6280i = zVar.f6280i;
            this.f6287q = zVar.f6287q;
        }
    }
}
