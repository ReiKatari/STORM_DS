package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb  reason: default package */
/* loaded from: classes.dex */
public final class zb implements f3, ja3, rs7 {
    public final /* synthetic */ int A;
    public int B;
    public Object L;

    public zb(Context context, XmlResourceParser xmlResourceParser) {
        this.A = 15;
        this.B = -1;
        this.L = new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e75.r);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.B = obtainStyledAttributes.getResourceId(index, this.B);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            iq6 iq6Var = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("StateSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (!name.equals("State")) {
                                break;
                            } else {
                                iq6Var = new iq6(context, xmlResourceParser);
                                ((SparseArray) this.L).put(iq6Var.a, iq6Var);
                                continue;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            continue;
                        case 1382829617:
                            name.equals("StateSet");
                            continue;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                jq6 jq6Var = new jq6(context, xmlResourceParser);
                                if (iq6Var != null) {
                                    iq6Var.b.add(jq6Var);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0086 -> B:23:0x008a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(zb zbVar, ad1 ad1Var, d20 d20Var) {
        qf3 qf3Var;
        int i;
        qf3 qf3Var2;
        LinkedHashMap linkedHashMap;
        byte b;
        ad1 ad1Var2;
        int i2;
        u0 u0Var;
        u0 u0Var2 = (u0) zbVar.L;
        if (d20Var instanceof qf3) {
            qf3Var = (qf3) d20Var;
            int i3 = qf3Var.g0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qf3Var.g0 = i3 - Integer.MIN_VALUE;
                Object obj = qf3Var.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = qf3Var.g0;
                if (i == 0) {
                    if (i == 1) {
                        int i4 = qf3Var.d0;
                        String str = qf3Var.Z;
                        LinkedHashMap linkedHashMap2 = qf3Var.Y;
                        zb zbVar2 = qf3Var.X;
                        ad1 ad1Var3 = qf3Var.R;
                        oi2.Y(obj);
                        int i5 = i4;
                        zbVar = zbVar2;
                        qf3Var2 = qf3Var;
                        linkedHashMap = linkedHashMap2;
                        ad1 ad1Var4 = ad1Var3;
                        x61 x61Var2 = obj;
                        linkedHashMap.put(str, (de3) x61Var2);
                        byte g = ((u0) zbVar.L).g();
                        if (g == 4) {
                            if (g == 7) {
                                b = g;
                                u0 u0Var3 = (u0) zbVar.L;
                                if (b == 6) {
                                    u0Var3.h((byte) 7);
                                } else if (b == 4) {
                                    hi2.F(u0Var3, "object");
                                    throw null;
                                }
                                return new ye3(linkedHashMap);
                            }
                            u0.q((u0) zbVar.L, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        ad1 ad1Var5 = ad1Var4;
                        b = g;
                        i2 = i5;
                        ad1Var2 = ad1Var5;
                        u0Var = (u0) zbVar.L;
                        if (u0Var.d()) {
                            String k = u0Var.k();
                            u0Var.h((byte) 5);
                            qf3Var2.R = ad1Var2;
                            qf3Var2.X = zbVar;
                            qf3Var2.Y = linkedHashMap;
                            qf3Var2.Z = k;
                            qf3Var2.d0 = i2;
                            qf3Var2.g0 = 1;
                            ad1Var2.getClass();
                            ad1Var2.B = qf3Var2;
                            x61Var2 = x61.COROUTINE_SUSPENDED;
                            if (x61Var2 == x61Var) {
                                return x61Var;
                            }
                            ad1 ad1Var6 = ad1Var2;
                            i5 = i2;
                            str = k;
                            ad1Var4 = ad1Var6;
                            linkedHashMap.put(str, (de3) x61Var2);
                            byte g2 = ((u0) zbVar.L).g();
                            if (g2 == 4) {
                            }
                        }
                        u0 u0Var32 = (u0) zbVar.L;
                        if (b == 6) {
                        }
                        return new ye3(linkedHashMap);
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                byte h = u0Var2.h((byte) 6);
                if (u0Var2.v() != 4) {
                    qf3Var2 = qf3Var;
                    linkedHashMap = new LinkedHashMap();
                    b = h;
                    ad1Var2 = ad1Var;
                    i2 = 0;
                    u0Var = (u0) zbVar.L;
                    if (u0Var.d()) {
                    }
                    u0 u0Var322 = (u0) zbVar.L;
                    if (b == 6) {
                    }
                    return new ye3(linkedHashMap);
                }
                u0.q(u0Var2, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
        }
        qf3Var = new qf3(zbVar, d20Var);
        Object obj2 = qf3Var.e0;
        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
        i = qf3Var.g0;
        if (i == 0) {
        }
    }

    public static void m(String str) {
        int i;
        boolean z;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (nb3.p(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public void A(View view) {
        wb wbVar = (wb) this.L;
        wbVar.u = view;
        wbVar.t = 0;
    }

    public ac B() {
        ac l = l();
        l.show();
        return l;
    }

    public int C(int i) {
        iq6 iq6Var;
        SparseArray sparseArray = (SparseArray) this.L;
        int i2 = 0;
        if (-1 == i) {
            if (i == -1) {
                iq6Var = (iq6) sparseArray.valueAt(0);
            } else {
                iq6Var = (iq6) sparseArray.get(-1);
            }
            if (iq6Var != null) {
                ArrayList arrayList = iq6Var.b;
                while (true) {
                    if (i2 < arrayList.size()) {
                        jq6 jq6Var = (jq6) arrayList.get(i2);
                        float f = jq6Var.d;
                        float f2 = jq6Var.c;
                        float f3 = jq6Var.b;
                        float f4 = jq6Var.a;
                        if ((Float.isNaN(f4) || -1.0f >= f4) && ((Float.isNaN(f3) || -1.0f >= f3) && ((Float.isNaN(f2) || -1.0f <= f2) && (Float.isNaN(f) || -1.0f <= f)))) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (-1 != i2) {
                    if (i2 == -1) {
                        return iq6Var.c;
                    }
                    return ((jq6) arrayList.get(i2)).e;
                }
            }
        } else {
            iq6 iq6Var2 = (iq6) sparseArray.get(i);
            if (iq6Var2 != null) {
                ArrayList arrayList2 = iq6Var2.b;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        jq6 jq6Var2 = (jq6) arrayList2.get(i2);
                        float f5 = jq6Var2.d;
                        float f6 = jq6Var2.c;
                        float f7 = jq6Var2.b;
                        float f8 = jq6Var2.a;
                        if ((Float.isNaN(f8) || -1.0f >= f8) && ((Float.isNaN(f7) || -1.0f >= f7) && ((Float.isNaN(f6) || -1.0f <= f6) && (Float.isNaN(f5) || -1.0f <= f5)))) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 == -1) {
                    return iq6Var2.c;
                }
                return ((jq6) arrayList2.get(i2)).e;
            }
        }
        return -1;
    }

    @Override // defpackage.rs7
    public synchronized d44 a(c44 c44Var) {
        d44 d44Var;
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.L).get(c44Var);
            d44 d44Var2 = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                xe5 xe5Var = (xe5) arrayList.get(i);
                Bitmap bitmap = (Bitmap) xe5Var.b.get();
                if (bitmap != null) {
                    d44Var = new d44(bitmap, xe5Var.c);
                } else {
                    d44Var = null;
                }
                if (d44Var != null) {
                    d44Var2 = d44Var;
                    break;
                }
                i++;
            }
            int i2 = this.B;
            this.B = i2 + 1;
            if (i2 >= 10) {
                j();
            }
            return d44Var2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.rs7
    public synchronized void b(int i) {
        if (i >= 10 && i != 20) {
            j();
        }
    }

    @Override // defpackage.f3
    public boolean c(View view) {
        ((BottomSheetBehavior) this.L).I(this.B);
        return true;
    }

    @Override // defpackage.ja3
    public void d(char c) {
        n(this.B, 1);
        int i = this.B;
        this.B = i + 1;
        ((char[]) this.L)[i] = c;
    }

    @Override // defpackage.ja3
    public void e(String str) {
        int i;
        str.getClass();
        n(this.B, str.length() + 2);
        char[] cArr = (char[]) this.L;
        int i2 = this.B;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = os6.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    n(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = os6.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) this.L)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = os6.a[charAt];
                                str2.getClass();
                                n(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.L, i5);
                                int length3 = str2.length() + i5;
                                this.B = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.L;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                this.B = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) this.L)[i5] = charAt;
                    }
                    i5 = i;
                }
                n(i5, 1);
                ((char[]) this.L)[i5] = '\"';
                this.B = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        this.B = i4 + 1;
    }

    @Override // defpackage.ja3
    public void f(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        n(this.B, length);
        str.getChars(0, str.length(), (char[]) this.L, this.B);
        this.B += length;
    }

    @Override // defpackage.rs7
    public synchronized void g(c44 c44Var, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.L;
            Object obj = linkedHashMap.get(c44Var);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c44Var, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            xe5 xe5Var = new xe5(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    xe5 xe5Var2 = (xe5) arrayList.get(i2);
                    if (i >= xe5Var2.d) {
                        if (xe5Var2.a == identityHashCode && xe5Var2.b.get() == bitmap) {
                            arrayList.set(i2, xe5Var);
                        } else {
                            arrayList.add(i2, xe5Var);
                        }
                    } else {
                        i2++;
                    }
                } else {
                    arrayList.add(xe5Var);
                    break;
                }
            }
            int i3 = this.B;
            this.B = i3 + 1;
            if (i3 >= 10) {
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void i(long j) {
        if (!k(j)) {
            int i = this.B;
            long[] jArr = (long[]) this.L;
            if (i >= jArr.length) {
                jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
                this.L = jArr;
            }
            jArr[i] = j;
            if (i >= this.B) {
                this.B = i + 1;
            }
        }
    }

    public void j() {
        Bitmap bitmap;
        this.B = 0;
        Iterator it = ((LinkedHashMap) this.L).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                xe5 xe5Var = (xe5) gt0.J0(arrayList);
                if (xe5Var != null) {
                    bitmap = (Bitmap) xe5Var.b.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((xe5) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public boolean k(long j) {
        int i = this.B;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.L)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public ac l() {
        int i;
        ListAdapter listAdapter;
        wb wbVar = (wb) this.L;
        ContextThemeWrapper contextThemeWrapper = wbVar.a;
        ContextThemeWrapper contextThemeWrapper2 = wbVar.a;
        ac acVar = new ac(contextThemeWrapper, this.B);
        View view = wbVar.e;
        yb ybVar = acVar.Z;
        if (view != null) {
            ybVar.x = view;
        } else {
            CharSequence charSequence = wbVar.d;
            if (charSequence != null) {
                ybVar.d = charSequence;
                TextView textView = ybVar.v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = wbVar.c;
            if (drawable != null) {
                ybVar.t = drawable;
                ImageView imageView = ybVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    ybVar.u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = wbVar.f;
        if (charSequence2 != null) {
            ybVar.e = charSequence2;
            TextView textView2 = ybVar.w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = wbVar.g;
        if (charSequence3 != null) {
            ybVar.c(-1, charSequence3, wbVar.h);
        }
        CharSequence charSequence4 = wbVar.i;
        if (charSequence4 != null) {
            ybVar.c(-2, charSequence4, wbVar.j);
        }
        CharSequence charSequence5 = wbVar.k;
        if (charSequence5 != null) {
            ybVar.c(-3, charSequence5, wbVar.l);
        }
        if (wbVar.q != null || wbVar.r != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) wbVar.b.inflate(ybVar.B, (ViewGroup) null);
            if (wbVar.w) {
                listAdapter = new tb(wbVar, contextThemeWrapper2, ybVar.C, wbVar.q, alertController$RecycleListView);
            } else {
                if (wbVar.x) {
                    i = ybVar.D;
                } else {
                    i = ybVar.E;
                }
                listAdapter = wbVar.r;
                if (listAdapter == null) {
                    listAdapter = new ArrayAdapter(contextThemeWrapper2, i, 16908308, wbVar.q);
                }
            }
            ybVar.y = listAdapter;
            ybVar.z = wbVar.y;
            if (wbVar.s != null) {
                alertController$RecycleListView.setOnItemClickListener(new ub(wbVar, ybVar));
            } else if (wbVar.z != null) {
                alertController$RecycleListView.setOnItemClickListener(new vb(wbVar, alertController$RecycleListView, ybVar));
            }
            if (wbVar.x) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (wbVar.w) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            ybVar.f = alertController$RecycleListView;
        }
        View view2 = wbVar.u;
        if (view2 != null) {
            ybVar.g = view2;
            ybVar.h = 0;
            ybVar.i = false;
        } else {
            int i2 = wbVar.t;
            if (i2 != 0) {
                ybVar.g = null;
                ybVar.h = i2;
                ybVar.i = false;
            }
        }
        acVar.setCancelable(wbVar.m);
        if (wbVar.m) {
            acVar.setCanceledOnTouchOutside(true);
        }
        acVar.setOnCancelListener(wbVar.n);
        acVar.setOnDismissListener(wbVar.o);
        k44 k44Var = wbVar.p;
        if (k44Var != null) {
            acVar.setOnKeyListener(k44Var);
        }
        return acVar;
    }

    public void n(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.L;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.L = Arrays.copyOf(cArr, i3);
        }
    }

    public void o(int i, pw pwVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            pw pwVar2 = ((pw[]) this.L)[i2];
            pwVar2.getClass();
            if (nb3.q(0L, pwVar.g - pwVar2.g) <= 0) {
                break;
            }
            pwVar2.f = i;
            ((pw[]) this.L)[i] = pwVar2;
            i = i2;
        }
        ((pw[]) this.L)[i] = pwVar;
        pwVar.f = i;
    }

    public void p(vm2 vm2Var, int i, int i2) {
        ((ai1) this.L).k(new mu6(vm2Var), i, i2);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, r41, ad1] */
    public de3 q() {
        de3 ye3Var;
        Object obj;
        u0 u0Var = (u0) this.L;
        byte v = u0Var.v();
        if (v == 1) {
            return s(true);
        }
        if (v == 0) {
            return s(false);
        }
        if (v == 6) {
            int i = this.B + 1;
            this.B = i;
            if (i == 200) {
                pf3 pf3Var = new pf3(this, null);
                x61 x61Var = zc1.a;
                ?? obj2 = new Object();
                obj2.A = pf3Var;
                obj2.B = obj2;
                x61 x61Var2 = zc1.a;
                obj2.L = x61Var2;
                while (true) {
                    obj = obj2.L;
                    r41 r41Var = obj2.B;
                    if (r41Var == null) {
                        break;
                    } else if (nb3.k(x61Var2, obj)) {
                        try {
                            pf3 pf3Var2 = obj2.A;
                            ge7.p(3, pf3Var2);
                            pf3 pf3Var3 = new pf3(pf3Var2.X, r41Var);
                            pf3Var3.R = obj2;
                            Object s = pf3Var3.s(jg7.a);
                            if (s != x61.COROUTINE_SUSPENDED) {
                                r41Var.i(s);
                            }
                        } catch (Throwable th) {
                            r41Var.i(new em5(th));
                        }
                    } else {
                        obj2.L = x61Var2;
                        r41Var.i(obj);
                    }
                }
                oi2.Y(obj);
                ye3Var = (de3) obj;
            } else {
                byte h = u0Var.h((byte) 6);
                if (u0Var.v() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!u0Var.d()) {
                            break;
                        }
                        String k = u0Var.k();
                        u0Var.h((byte) 5);
                        linkedHashMap.put(k, q());
                        h = u0Var.g();
                        if (h != 4) {
                            if (h != 7) {
                                u0.q(u0Var, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (h == 6) {
                        u0Var.h((byte) 7);
                    } else if (h == 4) {
                        hi2.F(u0Var, "object");
                        throw null;
                    }
                    ye3Var = new ye3(linkedHashMap);
                } else {
                    u0.q(u0Var, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.B--;
            return ye3Var;
        } else if (v == 8) {
            return r();
        } else {
            u0.q(u0Var, "Cannot read Json element because of unexpected ".concat(l.S(v)), 0, null, 6);
            throw null;
        }
    }

    public nd3 r() {
        boolean z;
        u0 u0Var = (u0) this.L;
        byte g = u0Var.g();
        if (u0Var.v() != 4) {
            ArrayList arrayList = new ArrayList();
            while (u0Var.d()) {
                arrayList.add(q());
                g = u0Var.g();
                if (g != 4) {
                    if (g == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = u0Var.B;
                    if (!z) {
                        u0.q(u0Var, "Expected end of the array or comma", i, null, 4);
                        throw null;
                    }
                }
            }
            if (g == 8) {
                u0Var.h((byte) 9);
            } else if (g == 4) {
                hi2.F(u0Var, "array");
                throw null;
            }
            return new nd3(arrayList);
        }
        u0.q(u0Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public df3 s(boolean z) {
        String k;
        u0 u0Var = (u0) this.L;
        if (!z) {
            k = u0Var.m();
        } else {
            k = u0Var.k();
        }
        if (!z && nb3.k(k, "null")) {
            return ue3.INSTANCE;
        }
        return new qe3(z, k);
    }

    public void t(long j) {
        int i = this.B;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.L)[i2]) {
                int i3 = this.B - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.L;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.B--;
                return;
            }
            i2++;
        }
    }

    public String toString() {
        switch (this.A) {
            case 7:
                return new String((char[]) this.L, 0, this.B);
            default:
                return super.toString();
        }
    }

    public void u(pw pwVar) {
        pw pwVar2;
        int i = pwVar.f;
        if (i != -1) {
            int i2 = this.B;
            pw pwVar3 = ((pw[]) this.L)[i2];
            pwVar3.getClass();
            pwVar.f = -1;
            ((pw[]) this.L)[i2] = null;
            this.B = i2 - 1;
            if (pwVar == pwVar3) {
                return;
            }
            int q = nb3.q(0L, pwVar3.g - pwVar.g);
            if (q == 0) {
                ((pw[]) this.L)[i] = pwVar3;
                pwVar3.f = i;
                return;
            } else if (q < 0) {
                while (true) {
                    int i3 = i << 1;
                    int i4 = i3 + 1;
                    int i5 = this.B;
                    if (i4 <= i5) {
                        pwVar2 = ((pw[]) this.L)[i3];
                        pwVar2.getClass();
                        pw pwVar4 = ((pw[]) this.L)[i4];
                        pwVar4.getClass();
                        if (nb3.q(0L, pwVar4.g - pwVar2.g) >= 0) {
                            pwVar2 = pwVar4;
                        }
                    } else if (i3 > i5) {
                        break;
                    } else {
                        pwVar2 = ((pw[]) this.L)[i3];
                        pwVar2.getClass();
                    }
                    if (nb3.q(0L, pwVar2.g - pwVar3.g) <= 0) {
                        break;
                    }
                    int i6 = pwVar2.f;
                    pwVar2.f = i;
                    ((pw[]) this.L)[i] = pwVar2;
                    i = i6;
                }
                ((pw[]) this.L)[i] = pwVar3;
                pwVar3.f = i;
                return;
            } else {
                o(i, pwVar3);
                return;
            }
        }
        i.h("Failed requirement.");
    }

    public void v(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        wb wbVar = (wb) this.L;
        wbVar.q = charSequenceArr;
        wbVar.s = onClickListener;
    }

    public void w(int i) {
        wb wbVar = (wb) this.L;
        wbVar.f = wbVar.a.getText(i);
    }

    @Override // defpackage.ja3
    public void writeLong(long j) {
        f(String.valueOf(j));
    }

    public void x(int i, DialogInterface.OnClickListener onClickListener) {
        wb wbVar = (wb) this.L;
        wbVar.i = wbVar.a.getText(i);
        wbVar.j = onClickListener;
    }

    public void y(int i, DialogInterface.OnClickListener onClickListener) {
        wb wbVar = (wb) this.L;
        wbVar.g = wbVar.a.getText(i);
        wbVar.h = onClickListener;
    }

    public void z(int i) {
        wb wbVar = (wb) this.L;
        wbVar.d = wbVar.a.getText(i);
    }

    public zb(int i, nf0 nf0Var) {
        this.A = 4;
        nf0Var.getClass();
        this.B = i;
        this.L = nf0Var;
    }

    public /* synthetic */ zb(Object obj, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }

    public zb(int i, byte b) {
        this.A = i;
        switch (i) {
            case 3:
                byte[][] bArr = new byte[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    bArr[i2] = new byte[614400];
                }
                this.L = bArr;
                return;
            case 12:
                this.L = new LinkedHashMap();
                return;
            default:
                this.B = 0;
                this.L = new StringBuilder();
                return;
        }
    }

    public zb(td3 td3Var, u0 u0Var) {
        this.A = 8;
        this.L = u0Var;
    }

    public zb(int i, int i2) {
        this.A = i2;
        switch (i2) {
            case 13:
                this.B = i;
                return;
            default:
                if (i >= 1 && i <= 256) {
                    this.B = i;
                    this.L = new byte[i];
                    return;
                }
                i.h(lb1.g(i, "Invalid distance: "));
                throw null;
        }
    }

    public /* synthetic */ zb(char c, int i) {
        this.A = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zb(ai1 ai1Var, int i) {
        this(i, 13);
        this.A = 13;
        this.L = ai1Var;
    }

    public zb(ArrayList arrayList) {
        this.A = 14;
        this.L = arrayList;
    }

    public zb(Context context) {
        this.A = 0;
        int i = ac.i(context, 0);
        this.L = new wb(new ContextThemeWrapper(context, ac.i(context, i)));
        this.B = i;
    }
}
