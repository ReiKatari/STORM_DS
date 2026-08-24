package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.b;
import androidx.constraintlayout.motion.widget.c;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b84  reason: default package */
/* loaded from: classes.dex */
public final class b84 {
    public final int a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public final float i;
    public final b j;
    public final ArrayList k;
    public c l;
    public final ArrayList m;
    public final int n;
    public final boolean o;
    public int p;
    public final int q;
    public final int r;

    public b84(b bVar, Context context, XmlResourceParser xmlResourceParser) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = 400;
        this.i = RecyclerView.B1;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.r = 0;
        int i = bVar.j;
        SparseArray sparseArray = bVar.g;
        this.h = i;
        this.q = bVar.k;
        this.j = bVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e75.t);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 2) {
                this.c = obtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    z11 z11Var = new z11();
                    z11Var.j(context, this.c);
                    sparseArray.append(this.c, z11Var);
                } else if ("xml".equals(resourceTypeName)) {
                    this.c = bVar.i(context, this.c);
                }
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                if ("layout".equals(resourceTypeName2)) {
                    z11 z11Var2 = new z11();
                    z11Var2.j(context, this.d);
                    sparseArray.append(this.d, z11Var2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.d = bVar.i(context, this.d);
                }
            } else if (index == 6) {
                int i3 = obtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    this.g = resourceId;
                    if (resourceId != -1) {
                        this.e = -2;
                    }
                } else if (i3 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.g = obtainStyledAttributes.getResourceId(index, -1);
                            this.e = -2;
                        } else {
                            this.e = -1;
                        }
                    }
                } else {
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                }
            } else if (index == 4) {
                int i4 = obtainStyledAttributes.getInt(index, this.h);
                this.h = i4;
                if (i4 < 8) {
                    this.h = 8;
                }
            } else if (index == 8) {
                this.i = obtainStyledAttributes.getFloat(index, this.i);
            } else if (index == 1) {
                this.n = obtainStyledAttributes.getInteger(index, this.n);
            } else if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 9) {
                this.o = obtainStyledAttributes.getBoolean(index, this.o);
            } else if (index == 7) {
                this.p = obtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.q = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.r = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.d == -1) {
            this.b = true;
        }
        obtainStyledAttributes.recycle();
    }

    public b84(b bVar, int i) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = 400;
        this.i = RecyclerView.B1;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.a = -1;
        this.j = bVar;
        this.d = R.id.view_transition;
        this.c = i;
        this.h = bVar.j;
        this.q = bVar.k;
    }

    public b84(b bVar, b84 b84Var) {
        this.a = -1;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.f = null;
        this.g = -1;
        this.h = 400;
        this.i = RecyclerView.B1;
        this.k = new ArrayList();
        this.l = null;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.j = bVar;
        this.h = bVar.j;
        if (b84Var != null) {
            this.p = b84Var.p;
            this.e = b84Var.e;
            this.f = b84Var.f;
            this.g = b84Var.g;
            this.h = b84Var.h;
            this.k = b84Var.k;
            this.i = b84Var.i;
            this.q = b84Var.q;
        }
    }
}
