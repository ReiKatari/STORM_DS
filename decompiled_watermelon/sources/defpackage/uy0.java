package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uy0  reason: default package */
/* loaded from: classes.dex */
public final class uy0 {
    public static final int[] h = {0, 4, 8};
    public static final SparseIntArray i;
    public static final SparseIntArray j;
    public String a;
    public String b = "";
    public String[] c = new String[0];
    public int d = 0;
    public final HashMap e = new HashMap();
    public boolean f = true;
    public final HashMap g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static py0 d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        py0 py0Var = new py0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, tx4.c);
        o(py0Var, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return py0Var;
    }

    public static int[] f(Barrier barrier, String str) {
        int i2;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            Object obj = null;
            try {
                i2 = px4.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.k0;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.k0.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i2 = ((Integer) obj).intValue();
                }
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        if (i4 != split.length) {
            return Arrays.copyOf(iArr, i4);
        }
        return iArr;
    }

    public static py0 g(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        SparseIntArray sparseIntArray;
        py0 py0Var = new py0();
        if (z) {
            iArr = tx4.c;
        } else {
            iArr = tx4.a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z) {
            o(py0Var, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                qy0 qy0Var = py0Var.e;
                if (i2 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i2);
                    sy0 sy0Var = py0Var.c;
                    ty0 ty0Var = py0Var.f;
                    ry0 ry0Var = py0Var.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        ry0Var.a = true;
                        qy0Var.b = true;
                        sy0Var.a = true;
                        ty0Var.a = true;
                    }
                    switch (i.get(index)) {
                        case 1:
                            qy0Var.q = l(obtainStyledAttributes, index, qy0Var.q);
                            break;
                        case 2:
                            qy0Var.J = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.J);
                            break;
                        case 3:
                            qy0Var.p = l(obtainStyledAttributes, index, qy0Var.p);
                            break;
                        case 4:
                            qy0Var.o = l(obtainStyledAttributes, index, qy0Var.o);
                            break;
                        case 5:
                            qy0Var.z = obtainStyledAttributes.getString(index);
                            break;
                        case ig7.b /* 6 */:
                            qy0Var.D = obtainStyledAttributes.getDimensionPixelOffset(index, qy0Var.D);
                            break;
                        case 7:
                            qy0Var.E = obtainStyledAttributes.getDimensionPixelOffset(index, qy0Var.E);
                            break;
                        case 8:
                            qy0Var.K = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.K);
                            break;
                        case 9:
                            qy0Var.w = l(obtainStyledAttributes, index, qy0Var.w);
                            break;
                        case 10:
                            qy0Var.v = l(obtainStyledAttributes, index, qy0Var.v);
                            break;
                        case 11:
                            qy0Var.Q = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.Q);
                            break;
                        case mj2.L /* 12 */:
                            qy0Var.R = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.R);
                            break;
                        case 13:
                            qy0Var.N = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.N);
                            break;
                        case 14:
                            qy0Var.P = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.P);
                            break;
                        case ig7.e /* 15 */:
                            qy0Var.S = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.S);
                            break;
                        case 16:
                            qy0Var.O = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.O);
                            break;
                        case 17:
                            qy0Var.e = obtainStyledAttributes.getDimensionPixelOffset(index, qy0Var.e);
                            break;
                        case 18:
                            qy0Var.f = obtainStyledAttributes.getDimensionPixelOffset(index, qy0Var.f);
                            break;
                        case 19:
                            qy0Var.g = obtainStyledAttributes.getFloat(index, qy0Var.g);
                            break;
                        case 20:
                            qy0Var.x = obtainStyledAttributes.getFloat(index, qy0Var.x);
                            break;
                        case 21:
                            qy0Var.d = obtainStyledAttributes.getLayoutDimension(index, qy0Var.d);
                            break;
                        case 22:
                            int i3 = obtainStyledAttributes.getInt(index, sy0Var.b);
                            sy0Var.b = i3;
                            sy0Var.b = h[i3];
                            break;
                        case 23:
                            qy0Var.c = obtainStyledAttributes.getLayoutDimension(index, qy0Var.c);
                            break;
                        case 24:
                            qy0Var.G = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.G);
                            break;
                        case 25:
                            qy0Var.i = l(obtainStyledAttributes, index, qy0Var.i);
                            break;
                        case 26:
                            qy0Var.j = l(obtainStyledAttributes, index, qy0Var.j);
                            break;
                        case 27:
                            qy0Var.F = obtainStyledAttributes.getInt(index, qy0Var.F);
                            break;
                        case 28:
                            qy0Var.H = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.H);
                            break;
                        case 29:
                            qy0Var.k = l(obtainStyledAttributes, index, qy0Var.k);
                            break;
                        case 30:
                            qy0Var.l = l(obtainStyledAttributes, index, qy0Var.l);
                            break;
                        case 31:
                            qy0Var.L = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.L);
                            break;
                        case 32:
                            qy0Var.t = l(obtainStyledAttributes, index, qy0Var.t);
                            break;
                        case 33:
                            qy0Var.u = l(obtainStyledAttributes, index, qy0Var.u);
                            break;
                        case 34:
                            qy0Var.I = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.I);
                            break;
                        case 35:
                            qy0Var.n = l(obtainStyledAttributes, index, qy0Var.n);
                            break;
                        case 36:
                            qy0Var.m = l(obtainStyledAttributes, index, qy0Var.m);
                            break;
                        case 37:
                            qy0Var.y = obtainStyledAttributes.getFloat(index, qy0Var.y);
                            break;
                        case 38:
                            py0Var.a = obtainStyledAttributes.getResourceId(index, py0Var.a);
                            break;
                        case 39:
                            qy0Var.V = obtainStyledAttributes.getFloat(index, qy0Var.V);
                            break;
                        case 40:
                            qy0Var.U = obtainStyledAttributes.getFloat(index, qy0Var.U);
                            break;
                        case 41:
                            qy0Var.W = obtainStyledAttributes.getInt(index, qy0Var.W);
                            break;
                        case 42:
                            qy0Var.X = obtainStyledAttributes.getInt(index, qy0Var.X);
                            break;
                        case 43:
                            sy0Var.d = obtainStyledAttributes.getFloat(index, sy0Var.d);
                            break;
                        case 44:
                            ty0Var.m = true;
                            ty0Var.n = obtainStyledAttributes.getDimension(index, ty0Var.n);
                            break;
                        case 45:
                            ty0Var.c = obtainStyledAttributes.getFloat(index, ty0Var.c);
                            break;
                        case 46:
                            ty0Var.d = obtainStyledAttributes.getFloat(index, ty0Var.d);
                            break;
                        case 47:
                            ty0Var.e = obtainStyledAttributes.getFloat(index, ty0Var.e);
                            break;
                        case 48:
                            ty0Var.f = obtainStyledAttributes.getFloat(index, ty0Var.f);
                            break;
                        case 49:
                            ty0Var.g = obtainStyledAttributes.getDimension(index, ty0Var.g);
                            break;
                        case 50:
                            ty0Var.h = obtainStyledAttributes.getDimension(index, ty0Var.h);
                            break;
                        case 51:
                            ty0Var.j = obtainStyledAttributes.getDimension(index, ty0Var.j);
                            break;
                        case 52:
                            ty0Var.k = obtainStyledAttributes.getDimension(index, ty0Var.k);
                            break;
                        case 53:
                            ty0Var.l = obtainStyledAttributes.getDimension(index, ty0Var.l);
                            break;
                        case 54:
                            qy0Var.Y = obtainStyledAttributes.getInt(index, qy0Var.Y);
                            break;
                        case 55:
                            qy0Var.Z = obtainStyledAttributes.getInt(index, qy0Var.Z);
                            break;
                        case 56:
                            qy0Var.a0 = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.a0);
                            break;
                        case 57:
                            qy0Var.b0 = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.b0);
                            break;
                        case 58:
                            qy0Var.c0 = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.c0);
                            break;
                        case 59:
                            qy0Var.d0 = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.d0);
                            break;
                        case 60:
                            ty0Var.b = obtainStyledAttributes.getFloat(index, ty0Var.b);
                            break;
                        case 61:
                            qy0Var.A = l(obtainStyledAttributes, index, qy0Var.A);
                            break;
                        case 62:
                            qy0Var.B = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.B);
                            break;
                        case 63:
                            qy0Var.C = obtainStyledAttributes.getFloat(index, qy0Var.C);
                            break;
                        case 64:
                            ry0Var.b = l(obtainStyledAttributes, index, ry0Var.b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type == 3) {
                                ry0Var.d = obtainStyledAttributes.getString(index);
                                break;
                            } else {
                                ry0Var.d = an1.R[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            }
                        case 66:
                            ry0Var.f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            ry0Var.h = obtainStyledAttributes.getFloat(index, ry0Var.h);
                            break;
                        case 68:
                            sy0Var.e = obtainStyledAttributes.getFloat(index, sy0Var.e);
                            break;
                        case 69:
                            qy0Var.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            qy0Var.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            qy0Var.g0 = obtainStyledAttributes.getInt(index, qy0Var.g0);
                            break;
                        case 73:
                            qy0Var.h0 = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.h0);
                            break;
                        case 74:
                            qy0Var.k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            qy0Var.o0 = obtainStyledAttributes.getBoolean(index, qy0Var.o0);
                            break;
                        case 76:
                            ry0Var.e = obtainStyledAttributes.getInt(index, ry0Var.e);
                            break;
                        case 77:
                            qy0Var.l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            sy0Var.c = obtainStyledAttributes.getInt(index, sy0Var.c);
                            break;
                        case 79:
                            ry0Var.g = obtainStyledAttributes.getFloat(index, ry0Var.g);
                            break;
                        case 80:
                            qy0Var.m0 = obtainStyledAttributes.getBoolean(index, qy0Var.m0);
                            break;
                        case 81:
                            qy0Var.n0 = obtainStyledAttributes.getBoolean(index, qy0Var.n0);
                            break;
                        case 82:
                            ry0Var.c = obtainStyledAttributes.getInteger(index, ry0Var.c);
                            break;
                        case 83:
                            ty0Var.i = l(obtainStyledAttributes, index, ty0Var.i);
                            break;
                        case 84:
                            ry0Var.j = obtainStyledAttributes.getInteger(index, ry0Var.j);
                            break;
                        case 85:
                            ry0Var.i = obtainStyledAttributes.getFloat(index, ry0Var.i);
                            break;
                        case 86:
                            int i4 = obtainStyledAttributes.peekValue(index).type;
                            if (i4 == 1) {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                ry0Var.m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    ry0Var.l = -2;
                                    break;
                                }
                            } else if (i4 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                ry0Var.k = string;
                                if (string.indexOf("/") > 0) {
                                    ry0Var.m = obtainStyledAttributes.getResourceId(index, -1);
                                    ry0Var.l = -2;
                                    break;
                                } else {
                                    ry0Var.l = -1;
                                    break;
                                }
                            } else {
                                ry0Var.l = obtainStyledAttributes.getInteger(index, ry0Var.m);
                                break;
                            }
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            qy0Var.r = l(obtainStyledAttributes, index, qy0Var.r);
                            break;
                        case 92:
                            qy0Var.s = l(obtainStyledAttributes, index, qy0Var.s);
                            break;
                        case 93:
                            qy0Var.M = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.M);
                            break;
                        case 94:
                            qy0Var.T = obtainStyledAttributes.getDimensionPixelSize(index, qy0Var.T);
                            break;
                        case 95:
                            m(qy0Var, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m(qy0Var, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            qy0Var.p0 = obtainStyledAttributes.getInt(index, qy0Var.p0);
                            break;
                    }
                    i2++;
                } else if (qy0Var.k0 != null) {
                    qy0Var.j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return py0Var;
    }

    public static int l(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        if (resourceId == -1) {
            return typedArray.getInt(i2, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.m(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void n(jy0 jy0Var, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                }
                i3 = i2;
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i2, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > RecyclerView.A1 && parseFloat2 > RecyclerView.A1) {
                            if (i3 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i2);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        jy0Var.G = str;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [oy0, java.lang.Object] */
    public static void o(py0 py0Var, TypedArray typedArray) {
        char c;
        int indexCount = typedArray.getIndexCount();
        ?? obj = new Object();
        obj.a = new int[10];
        obj.b = new int[10];
        obj.c = 0;
        obj.d = new int[10];
        obj.e = new float[10];
        obj.f = 0;
        obj.g = new int[5];
        obj.h = new String[5];
        obj.i = 0;
        obj.j = new int[4];
        obj.k = new boolean[4];
        obj.l = 0;
        py0Var.h = obj;
        ry0 ry0Var = py0Var.d;
        ry0Var.a = false;
        qy0 qy0Var = py0Var.e;
        qy0Var.b = false;
        sy0 sy0Var = py0Var.c;
        sy0Var.a = false;
        ty0 ty0Var = py0Var.f;
        ty0Var.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i3) {
                case 2:
                    c = 5;
                    obj.b(2, typedArray.getDimensionPixelSize(index, qy0Var.J));
                    continue;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 5:
                    c = 5;
                    obj.c(5, typedArray.getString(index));
                    continue;
                case ig7.b /* 6 */:
                    obj.b(6, typedArray.getDimensionPixelOffset(index, qy0Var.D));
                    break;
                case 7:
                    obj.b(7, typedArray.getDimensionPixelOffset(index, qy0Var.E));
                    break;
                case 8:
                    obj.b(8, typedArray.getDimensionPixelSize(index, qy0Var.K));
                    break;
                case 11:
                    obj.b(11, typedArray.getDimensionPixelSize(index, qy0Var.Q));
                    break;
                case mj2.L /* 12 */:
                    obj.b(12, typedArray.getDimensionPixelSize(index, qy0Var.R));
                    break;
                case 13:
                    obj.b(13, typedArray.getDimensionPixelSize(index, qy0Var.N));
                    break;
                case 14:
                    obj.b(14, typedArray.getDimensionPixelSize(index, qy0Var.P));
                    break;
                case ig7.e /* 15 */:
                    obj.b(15, typedArray.getDimensionPixelSize(index, qy0Var.S));
                    break;
                case 16:
                    obj.b(16, typedArray.getDimensionPixelSize(index, qy0Var.O));
                    break;
                case 17:
                    obj.b(17, typedArray.getDimensionPixelOffset(index, qy0Var.e));
                    break;
                case 18:
                    obj.b(18, typedArray.getDimensionPixelOffset(index, qy0Var.f));
                    break;
                case 19:
                    obj.a(19, typedArray.getFloat(index, qy0Var.g));
                    break;
                case 20:
                    obj.a(20, typedArray.getFloat(index, qy0Var.x));
                    break;
                case 21:
                    obj.b(21, typedArray.getLayoutDimension(index, qy0Var.d));
                    break;
                case 22:
                    obj.b(22, h[typedArray.getInt(index, sy0Var.b)]);
                    break;
                case 23:
                    obj.b(23, typedArray.getLayoutDimension(index, qy0Var.c));
                    break;
                case 24:
                    obj.b(24, typedArray.getDimensionPixelSize(index, qy0Var.G));
                    break;
                case 27:
                    obj.b(27, typedArray.getInt(index, qy0Var.F));
                    break;
                case 28:
                    obj.b(28, typedArray.getDimensionPixelSize(index, qy0Var.H));
                    break;
                case 31:
                    obj.b(31, typedArray.getDimensionPixelSize(index, qy0Var.L));
                    break;
                case 34:
                    obj.b(34, typedArray.getDimensionPixelSize(index, qy0Var.I));
                    break;
                case 37:
                    obj.a(37, typedArray.getFloat(index, qy0Var.y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, py0Var.a);
                    py0Var.a = resourceId;
                    obj.b(38, resourceId);
                    break;
                case 39:
                    obj.a(39, typedArray.getFloat(index, qy0Var.V));
                    break;
                case 40:
                    obj.a(40, typedArray.getFloat(index, qy0Var.U));
                    break;
                case 41:
                    obj.b(41, typedArray.getInt(index, qy0Var.W));
                    break;
                case 42:
                    obj.b(42, typedArray.getInt(index, qy0Var.X));
                    break;
                case 43:
                    obj.a(43, typedArray.getFloat(index, sy0Var.d));
                    break;
                case 44:
                    obj.d(44, true);
                    obj.a(44, typedArray.getDimension(index, ty0Var.n));
                    break;
                case 45:
                    obj.a(45, typedArray.getFloat(index, ty0Var.c));
                    break;
                case 46:
                    obj.a(46, typedArray.getFloat(index, ty0Var.d));
                    break;
                case 47:
                    obj.a(47, typedArray.getFloat(index, ty0Var.e));
                    break;
                case 48:
                    obj.a(48, typedArray.getFloat(index, ty0Var.f));
                    break;
                case 49:
                    obj.a(49, typedArray.getDimension(index, ty0Var.g));
                    break;
                case 50:
                    obj.a(50, typedArray.getDimension(index, ty0Var.h));
                    break;
                case 51:
                    obj.a(51, typedArray.getDimension(index, ty0Var.j));
                    break;
                case 52:
                    obj.a(52, typedArray.getDimension(index, ty0Var.k));
                    break;
                case 53:
                    obj.a(53, typedArray.getDimension(index, ty0Var.l));
                    break;
                case 54:
                    obj.b(54, typedArray.getInt(index, qy0Var.Y));
                    break;
                case 55:
                    obj.b(55, typedArray.getInt(index, qy0Var.Z));
                    break;
                case 56:
                    obj.b(56, typedArray.getDimensionPixelSize(index, qy0Var.a0));
                    break;
                case 57:
                    obj.b(57, typedArray.getDimensionPixelSize(index, qy0Var.b0));
                    break;
                case 58:
                    obj.b(58, typedArray.getDimensionPixelSize(index, qy0Var.c0));
                    break;
                case 59:
                    obj.b(59, typedArray.getDimensionPixelSize(index, qy0Var.d0));
                    break;
                case 60:
                    obj.a(60, typedArray.getFloat(index, ty0Var.b));
                    break;
                case 62:
                    obj.b(62, typedArray.getDimensionPixelSize(index, qy0Var.B));
                    break;
                case 63:
                    obj.a(63, typedArray.getFloat(index, qy0Var.C));
                    break;
                case 64:
                    obj.b(64, l(typedArray, index, ry0Var.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        obj.c(65, typedArray.getString(index));
                        break;
                    } else {
                        obj.c(65, an1.R[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    obj.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    obj.a(67, typedArray.getFloat(index, ry0Var.h));
                    break;
                case 68:
                    obj.a(68, typedArray.getFloat(index, sy0Var.e));
                    break;
                case 69:
                    obj.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    obj.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    obj.b(72, typedArray.getInt(index, qy0Var.g0));
                    break;
                case 73:
                    obj.b(73, typedArray.getDimensionPixelSize(index, qy0Var.h0));
                    break;
                case 74:
                    obj.c(74, typedArray.getString(index));
                    break;
                case 75:
                    obj.d(75, typedArray.getBoolean(index, qy0Var.o0));
                    break;
                case 76:
                    obj.b(76, typedArray.getInt(index, ry0Var.e));
                    break;
                case 77:
                    obj.c(77, typedArray.getString(index));
                    break;
                case 78:
                    obj.b(78, typedArray.getInt(index, sy0Var.c));
                    break;
                case 79:
                    obj.a(79, typedArray.getFloat(index, ry0Var.g));
                    break;
                case 80:
                    obj.d(80, typedArray.getBoolean(index, qy0Var.m0));
                    break;
                case 81:
                    obj.d(81, typedArray.getBoolean(index, qy0Var.n0));
                    break;
                case 82:
                    obj.b(82, typedArray.getInteger(index, ry0Var.c));
                    break;
                case 83:
                    obj.b(83, l(typedArray, index, ty0Var.i));
                    break;
                case 84:
                    obj.b(84, typedArray.getInteger(index, ry0Var.j));
                    break;
                case 85:
                    obj.a(85, typedArray.getFloat(index, ry0Var.i));
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        ry0Var.m = resourceId2;
                        obj.b(89, resourceId2);
                        if (ry0Var.m != -1) {
                            ry0Var.l = -2;
                            obj.b(88, -2);
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        ry0Var.k = string;
                        obj.c(90, string);
                        if (ry0Var.k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            ry0Var.m = resourceId3;
                            obj.b(89, resourceId3);
                            ry0Var.l = -2;
                            obj.b(88, -2);
                        } else {
                            ry0Var.l = -1;
                            obj.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, ry0Var.m);
                        ry0Var.l = integer;
                        obj.b(88, integer);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    obj.b(93, typedArray.getDimensionPixelSize(index, qy0Var.M));
                    break;
                case 94:
                    obj.b(94, typedArray.getDimensionPixelSize(index, qy0Var.T));
                    break;
                case 95:
                    m(obj, typedArray, index, 0);
                    break;
                case 96:
                    m(obj, typedArray, index, 1);
                    break;
                case 97:
                    obj.b(97, typedArray.getInt(index, qy0Var.p0));
                    break;
                case 98:
                    if (MotionLayout.s1) {
                        int resourceId4 = typedArray.getResourceId(index, py0Var.a);
                        py0Var.a = resourceId4;
                        if (resourceId4 == -1) {
                            py0Var.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        py0Var.b = typedArray.getString(index);
                    } else {
                        py0Var.a = typedArray.getResourceId(index, py0Var.a);
                    }
                    break;
                case 99:
                    obj.d(99, typedArray.getBoolean(index, qy0Var.h));
                    break;
            }
            c = 5;
        }
    }

    public final void a(MotionLayout motionLayout) {
        py0 py0Var;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer valueOf = Integer.valueOf(id);
            HashMap hashMap = this.g;
            if (!hashMap.containsKey(valueOf)) {
                Log.w("ConstraintSet", "id unknown " + b53.N(childAt));
            } else if (this.f && id == -1) {
                f81.w("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (hashMap.containsKey(Integer.valueOf(id)) && (py0Var = (py0) hashMap.get(Integer.valueOf(id))) != null) {
                ey0.e(childAt, py0Var.g);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.g;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + b53.N(childAt));
            } else if (this.f && id == -1) {
                f81.w("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (id != -1) {
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    py0 py0Var = (py0) hashMap.get(Integer.valueOf(id));
                    if (py0Var != null) {
                        sy0 sy0Var = py0Var.c;
                        qy0 qy0Var = py0Var.e;
                        ty0 ty0Var = py0Var.f;
                        if (childAt instanceof Barrier) {
                            qy0Var.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(qy0Var.g0);
                            barrier.setMargin(qy0Var.h0);
                            barrier.setAllowsGoneWidget(qy0Var.o0);
                            int[] iArr = qy0Var.j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = qy0Var.k0;
                                if (str != null) {
                                    int[] f = f(barrier, str);
                                    qy0Var.j0 = f;
                                    barrier.setReferencedIds(f);
                                }
                            }
                        }
                        jy0 jy0Var = (jy0) childAt.getLayoutParams();
                        jy0Var.a();
                        py0Var.b(jy0Var);
                        ey0.e(childAt, py0Var.g);
                        childAt.setLayoutParams(jy0Var);
                        if (sy0Var.c == 0) {
                            childAt.setVisibility(sy0Var.b);
                        }
                        childAt.setAlpha(sy0Var.d);
                        childAt.setRotation(ty0Var.b);
                        childAt.setRotationX(ty0Var.c);
                        childAt.setRotationY(ty0Var.d);
                        childAt.setScaleX(ty0Var.e);
                        childAt.setScaleY(ty0Var.f);
                        if (ty0Var.i != -1) {
                            if (((View) childAt.getParent()).findViewById(ty0Var.i) != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(ty0Var.g)) {
                                childAt.setPivotX(ty0Var.g);
                            }
                            if (!Float.isNaN(ty0Var.h)) {
                                childAt.setPivotY(ty0Var.h);
                            }
                        }
                        childAt.setTranslationX(ty0Var.j);
                        childAt.setTranslationY(ty0Var.k);
                        childAt.setTranslationZ(ty0Var.l);
                        if (ty0Var.m) {
                            childAt.setElevation(ty0Var.n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            py0 py0Var2 = (py0) hashMap.get(num);
            if (py0Var2 != null) {
                qy0 qy0Var2 = py0Var2.e;
                if (qy0Var2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = qy0Var2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = qy0Var2.k0;
                        if (str2 != null) {
                            int[] f2 = f(barrier2, str2);
                            qy0Var2.j0 = f2;
                            barrier2.setReferencedIds(f2);
                        }
                    }
                    barrier2.setType(qy0Var2.g0);
                    barrier2.setMargin(qy0Var2.h0);
                    o56 o56Var = ConstraintLayout.n0;
                    jy0 jy0Var2 = new jy0();
                    barrier2.k();
                    py0Var2.b(jy0Var2);
                    constraintLayout.addView(barrier2, jy0Var2);
                }
                if (qy0Var2.a) {
                    View xo2Var = new xo2(constraintLayout.getContext());
                    xo2Var.setId(num.intValue());
                    o56 o56Var2 = ConstraintLayout.n0;
                    jy0 jy0Var3 = new jy0();
                    py0Var2.b(jy0Var3);
                    constraintLayout.addView(xo2Var, jy0Var3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof gy0) {
                ((gy0) childAt2).e(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i2;
        HashMap hashMap;
        int i3;
        uy0 uy0Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = uy0Var.g;
        hashMap2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            jy0 jy0Var = (jy0) childAt.getLayoutParams();
            int id = childAt.getId();
            if (uy0Var.f && id == -1) {
                f81.w("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new py0());
            }
            py0 py0Var = (py0) hashMap2.get(Integer.valueOf(id));
            if (py0Var == null) {
                i2 = childCount;
                hashMap = hashMap2;
                i3 = i4;
            } else {
                sy0 sy0Var = py0Var.c;
                qy0 qy0Var = py0Var.e;
                ty0 ty0Var = py0Var.f;
                i2 = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i3 = i4;
                HashMap hashMap4 = uy0Var.e;
                for (String str : hashMap4.keySet()) {
                    ey0 ey0Var = (ey0) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new ey0(ey0Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new ey0(ey0Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder u = b31.u(" Custom Attribute \"", str, "\" not found on ");
                        u.append(cls.getName());
                        Log.e("TransitionLayout", u.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder u2 = b31.u(" Custom Attribute \"", str, "\" not found on ");
                        u2.append(cls.getName());
                        Log.e("TransitionLayout", u2.toString(), e3);
                    }
                    hashMap4 = hashMap5;
                }
                py0Var.g = hashMap3;
                py0.a(py0Var, id, jy0Var);
                sy0Var.b = childAt.getVisibility();
                sy0Var.d = childAt.getAlpha();
                ty0Var.b = childAt.getRotation();
                ty0Var.c = childAt.getRotationX();
                ty0Var.d = childAt.getRotationY();
                ty0Var.e = childAt.getScaleX();
                ty0Var.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    ty0Var.g = pivotX;
                    ty0Var.h = pivotY;
                }
                ty0Var.j = childAt.getTranslationX();
                ty0Var.k = childAt.getTranslationY();
                ty0Var.l = childAt.getTranslationZ();
                if (ty0Var.m) {
                    ty0Var.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    qy0Var.o0 = barrier.getAllowsGoneWidget();
                    qy0Var.j0 = barrier.getReferencedIds();
                    qy0Var.g0 = barrier.getType();
                    qy0Var.h0 = barrier.getMargin();
                }
            }
            i4 = i3 + 1;
            uy0Var = this;
            childCount = i2;
            hashMap2 = hashMap;
        }
    }

    public final py0 h(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new py0());
        }
        return (py0) hashMap.get(Integer.valueOf(i2));
    }

    public final py0 i(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (hashMap.containsKey(valueOf)) {
            return (py0) hashMap.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void j(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    py0 g = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        g.e.a = true;
                    }
                    this.g.put(Integer.valueOf(g.a), g);
                    continue;
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01af, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad A[Catch: IOException -> 0x0034, XmlPullParserException -> 0x0037, TryCatch #2 {IOException -> 0x0034, XmlPullParserException -> 0x0037, blocks: (B:3:0x0004, B:81:0x01af, B:12:0x0017, B:13:0x0025, B:15:0x002a, B:22:0x003a, B:30:0x0054, B:25:0x0043, B:28:0x004c, B:31:0x0062, B:35:0x0072, B:37:0x007a, B:38:0x0084, B:47:0x00ad, B:48:0x00b4, B:49:0x00cc, B:41:0x008d, B:43:0x0095, B:44:0x00a3, B:50:0x00cd, B:52:0x00d5, B:53:0x00e5, B:56:0x00ef, B:57:0x00fa, B:58:0x0112, B:59:0x0113, B:62:0x011d, B:63:0x0128, B:64:0x0140, B:65:0x0141, B:67:0x0149, B:68:0x0152, B:71:0x015c, B:72:0x0166, B:73:0x017e, B:74:0x017f, B:77:0x0189, B:78:0x0193, B:79:0x01ab, B:80:0x01ac), top: B:86:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.k(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
