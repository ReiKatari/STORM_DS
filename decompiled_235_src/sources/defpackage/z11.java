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
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z11  reason: default package */
/* loaded from: classes.dex */
public final class z11 {
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
        sparseIntArray.append(MlKitException.NOT_ENOUGH_SPACE, 6);
        sparseIntArray.append(MlKitException.MODEL_HASH_MISMATCH, 7);
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
        sparseIntArray2.append(MlKitException.MODEL_HASH_MISMATCH, 85);
        sparseIntArray2.append(MlKitException.NOT_ENOUGH_SPACE, 86);
        sparseIntArray2.append(94, 97);
    }

    public static u11 d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        u11 u11Var = new u11();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, e75.c);
        o(u11Var, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return u11Var;
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
                i2 = z65.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.l0;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.l0.get(trim);
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

    public static u11 g(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        SparseIntArray sparseIntArray;
        u11 u11Var = new u11();
        if (z) {
            iArr = e75.c;
        } else {
            iArr = e75.a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z) {
            o(u11Var, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                v11 v11Var = u11Var.e;
                if (i2 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i2);
                    x11 x11Var = u11Var.c;
                    y11 y11Var = u11Var.f;
                    w11 w11Var = u11Var.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        w11Var.a = true;
                        v11Var.b = true;
                        x11Var.a = true;
                        y11Var.a = true;
                    }
                    switch (i.get(index)) {
                        case 1:
                            v11Var.q = l(obtainStyledAttributes, index, v11Var.q);
                            break;
                        case 2:
                            v11Var.J = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.J);
                            break;
                        case 3:
                            v11Var.p = l(obtainStyledAttributes, index, v11Var.p);
                            break;
                        case 4:
                            v11Var.o = l(obtainStyledAttributes, index, v11Var.o);
                            break;
                        case 5:
                            v11Var.z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            v11Var.D = obtainStyledAttributes.getDimensionPixelOffset(index, v11Var.D);
                            break;
                        case 7:
                            v11Var.E = obtainStyledAttributes.getDimensionPixelOffset(index, v11Var.E);
                            break;
                        case 8:
                            v11Var.K = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.K);
                            break;
                        case 9:
                            v11Var.w = l(obtainStyledAttributes, index, v11Var.w);
                            break;
                        case 10:
                            v11Var.v = l(obtainStyledAttributes, index, v11Var.v);
                            break;
                        case 11:
                            v11Var.Q = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.Q);
                            break;
                        case 12:
                            v11Var.R = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.R);
                            break;
                        case 13:
                            v11Var.N = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.N);
                            break;
                        case 14:
                            v11Var.P = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.P);
                            break;
                        case 15:
                            v11Var.S = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.S);
                            break;
                        case 16:
                            v11Var.O = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.O);
                            break;
                        case 17:
                            v11Var.e = obtainStyledAttributes.getDimensionPixelOffset(index, v11Var.e);
                            break;
                        case 18:
                            v11Var.f = obtainStyledAttributes.getDimensionPixelOffset(index, v11Var.f);
                            break;
                        case 19:
                            v11Var.g = obtainStyledAttributes.getFloat(index, v11Var.g);
                            break;
                        case 20:
                            v11Var.x = obtainStyledAttributes.getFloat(index, v11Var.x);
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            v11Var.d = obtainStyledAttributes.getLayoutDimension(index, v11Var.d);
                            break;
                        case 22:
                            int i3 = obtainStyledAttributes.getInt(index, x11Var.b);
                            x11Var.b = i3;
                            x11Var.b = h[i3];
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            v11Var.c = obtainStyledAttributes.getLayoutDimension(index, v11Var.c);
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            v11Var.G = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.G);
                            break;
                        case 25:
                            v11Var.i = l(obtainStyledAttributes, index, v11Var.i);
                            break;
                        case SubAllocator.N4 /* 26 */:
                            v11Var.j = l(obtainStyledAttributes, index, v11Var.j);
                            break;
                        case 27:
                            v11Var.F = obtainStyledAttributes.getInt(index, v11Var.F);
                            break;
                        case 28:
                            v11Var.H = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.H);
                            break;
                        case 29:
                            v11Var.k = l(obtainStyledAttributes, index, v11Var.k);
                            break;
                        case 30:
                            v11Var.l = l(obtainStyledAttributes, index, v11Var.l);
                            break;
                        case 31:
                            v11Var.L = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.L);
                            break;
                        case 32:
                            v11Var.t = l(obtainStyledAttributes, index, v11Var.t);
                            break;
                        case 33:
                            v11Var.u = l(obtainStyledAttributes, index, v11Var.u);
                            break;
                        case 34:
                            v11Var.I = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.I);
                            break;
                        case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                            v11Var.n = l(obtainStyledAttributes, index, v11Var.n);
                            break;
                        case 36:
                            v11Var.m = l(obtainStyledAttributes, index, v11Var.m);
                            break;
                        case 37:
                            v11Var.y = obtainStyledAttributes.getFloat(index, v11Var.y);
                            break;
                        case SubAllocator.N_INDEXES /* 38 */:
                            u11Var.a = obtainStyledAttributes.getResourceId(index, u11Var.a);
                            break;
                        case 39:
                            v11Var.V = obtainStyledAttributes.getFloat(index, v11Var.V);
                            break;
                        case 40:
                            v11Var.U = obtainStyledAttributes.getFloat(index, v11Var.U);
                            break;
                        case 41:
                            v11Var.W = obtainStyledAttributes.getInt(index, v11Var.W);
                            break;
                        case 42:
                            v11Var.X = obtainStyledAttributes.getInt(index, v11Var.X);
                            break;
                        case 43:
                            x11Var.d = obtainStyledAttributes.getFloat(index, x11Var.d);
                            break;
                        case 44:
                            y11Var.m = true;
                            y11Var.n = obtainStyledAttributes.getDimension(index, y11Var.n);
                            break;
                        case 45:
                            y11Var.c = obtainStyledAttributes.getFloat(index, y11Var.c);
                            break;
                        case 46:
                            y11Var.d = obtainStyledAttributes.getFloat(index, y11Var.d);
                            break;
                        case 47:
                            y11Var.e = obtainStyledAttributes.getFloat(index, y11Var.e);
                            break;
                        case Compress.DC20 /* 48 */:
                            y11Var.f = obtainStyledAttributes.getFloat(index, y11Var.f);
                            break;
                        case 49:
                            y11Var.g = obtainStyledAttributes.getDimension(index, y11Var.g);
                            break;
                        case 50:
                            y11Var.h = obtainStyledAttributes.getDimension(index, y11Var.h);
                            break;
                        case 51:
                            y11Var.j = obtainStyledAttributes.getDimension(index, y11Var.j);
                            break;
                        case 52:
                            y11Var.k = obtainStyledAttributes.getDimension(index, y11Var.k);
                            break;
                        case 53:
                            y11Var.l = obtainStyledAttributes.getDimension(index, y11Var.l);
                            break;
                        case 54:
                            v11Var.Y = obtainStyledAttributes.getInt(index, v11Var.Y);
                            break;
                        case 55:
                            v11Var.Z = obtainStyledAttributes.getInt(index, v11Var.Z);
                            break;
                        case 56:
                            v11Var.a0 = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.a0);
                            break;
                        case 57:
                            v11Var.b0 = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.b0);
                            break;
                        case 58:
                            v11Var.c0 = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.c0);
                            break;
                        case 59:
                            v11Var.d0 = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.d0);
                            break;
                        case Compress.DC /* 60 */:
                            y11Var.b = obtainStyledAttributes.getFloat(index, y11Var.b);
                            break;
                        case 61:
                            v11Var.A = l(obtainStyledAttributes, index, v11Var.A);
                            break;
                        case 62:
                            v11Var.B = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.B);
                            break;
                        case 63:
                            v11Var.C = obtainStyledAttributes.getFloat(index, v11Var.C);
                            break;
                        case 64:
                            w11Var.b = l(obtainStyledAttributes, index, w11Var.b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type == 3) {
                                w11Var.d = obtainStyledAttributes.getString(index);
                                break;
                            } else {
                                w11Var.d = gr1.R[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            }
                        case 66:
                            w11Var.f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            w11Var.h = obtainStyledAttributes.getFloat(index, w11Var.h);
                            break;
                        case 68:
                            x11Var.e = obtainStyledAttributes.getFloat(index, x11Var.e);
                            break;
                        case 69:
                            v11Var.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            v11Var.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            v11Var.g0 = obtainStyledAttributes.getInt(index, v11Var.g0);
                            break;
                        case 73:
                            v11Var.h0 = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.h0);
                            break;
                        case 74:
                            v11Var.k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            v11Var.o0 = obtainStyledAttributes.getBoolean(index, v11Var.o0);
                            break;
                        case 76:
                            w11Var.e = obtainStyledAttributes.getInt(index, w11Var.e);
                            break;
                        case 77:
                            v11Var.l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            x11Var.c = obtainStyledAttributes.getInt(index, x11Var.c);
                            break;
                        case 79:
                            w11Var.g = obtainStyledAttributes.getFloat(index, w11Var.g);
                            break;
                        case 80:
                            v11Var.m0 = obtainStyledAttributes.getBoolean(index, v11Var.m0);
                            break;
                        case 81:
                            v11Var.n0 = obtainStyledAttributes.getBoolean(index, v11Var.n0);
                            break;
                        case 82:
                            w11Var.c = obtainStyledAttributes.getInteger(index, w11Var.c);
                            break;
                        case 83:
                            y11Var.i = l(obtainStyledAttributes, index, y11Var.i);
                            break;
                        case 84:
                            w11Var.j = obtainStyledAttributes.getInteger(index, w11Var.j);
                            break;
                        case 85:
                            w11Var.i = obtainStyledAttributes.getFloat(index, w11Var.i);
                            break;
                        case 86:
                            int i4 = obtainStyledAttributes.peekValue(index).type;
                            if (i4 == 1) {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                w11Var.m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    w11Var.l = -2;
                                    break;
                                }
                            } else if (i4 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                w11Var.k = string;
                                if (string.indexOf("/") > 0) {
                                    w11Var.m = obtainStyledAttributes.getResourceId(index, -1);
                                    w11Var.l = -2;
                                    break;
                                } else {
                                    w11Var.l = -1;
                                    break;
                                }
                            } else {
                                w11Var.l = obtainStyledAttributes.getInteger(index, w11Var.m);
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
                            v11Var.r = l(obtainStyledAttributes, index, v11Var.r);
                            break;
                        case 92:
                            v11Var.s = l(obtainStyledAttributes, index, v11Var.s);
                            break;
                        case 93:
                            v11Var.M = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.M);
                            break;
                        case 94:
                            v11Var.T = obtainStyledAttributes.getDimensionPixelSize(index, v11Var.T);
                            break;
                        case 95:
                            m(v11Var, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m(v11Var, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            v11Var.p0 = obtainStyledAttributes.getInt(index, v11Var.p0);
                            break;
                    }
                    i2++;
                } else if (v11Var.k0 != null) {
                    v11Var.j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return u11Var;
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
    */
    public static void m(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        if (obj != null) {
            int i4 = typedArray.peekValue(i2).type;
            boolean z = true;
            int i5 = 0;
            if (i4 != 3) {
                if (i4 != 5) {
                    dimensionPixelSize = typedArray.getInt(i2, 0);
                    if (dimensionPixelSize != -4) {
                        if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                            z = false;
                        }
                    } else {
                        i5 = -2;
                    }
                    if (!(obj instanceof o11)) {
                        o11 o11Var = (o11) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) o11Var).width = i5;
                            o11Var.W = z;
                            return;
                        }
                        ((ViewGroup.MarginLayoutParams) o11Var).height = i5;
                        o11Var.X = z;
                        return;
                    } else if (obj instanceof v11) {
                        v11 v11Var = (v11) obj;
                        if (i3 == 0) {
                            v11Var.c = i5;
                            v11Var.m0 = z;
                            return;
                        }
                        v11Var.d = i5;
                        v11Var.n0 = z;
                        return;
                    } else if (obj instanceof t11) {
                        t11 t11Var = (t11) obj;
                        if (i3 == 0) {
                            t11Var.b(23, i5);
                            t11Var.d(80, z);
                            return;
                        }
                        t11Var.b(21, i5);
                        t11Var.d(81, z);
                        return;
                    } else {
                        return;
                    }
                }
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
                z = false;
                i5 = dimensionPixelSize;
                if (!(obj instanceof o11)) {
                }
            } else {
                String string = typedArray.getString(i2);
                if (string != null) {
                    int indexOf = string.indexOf(61);
                    int length = string.length();
                    if (indexOf > 0 && indexOf < length - 1) {
                        String substring = string.substring(0, indexOf);
                        String substring2 = string.substring(indexOf + 1);
                        if (substring2.length() > 0) {
                            String trim = substring.trim();
                            String trim2 = substring2.trim();
                            if ("ratio".equalsIgnoreCase(trim)) {
                                if (obj instanceof o11) {
                                    o11 o11Var2 = (o11) obj;
                                    if (i3 == 0) {
                                        ((ViewGroup.MarginLayoutParams) o11Var2).width = 0;
                                    } else {
                                        ((ViewGroup.MarginLayoutParams) o11Var2).height = 0;
                                    }
                                    n(o11Var2, trim2);
                                    return;
                                } else if (obj instanceof v11) {
                                    ((v11) obj).z = trim2;
                                    return;
                                } else if (obj instanceof t11) {
                                    ((t11) obj).c(5, trim2);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            try {
                                if ("weight".equalsIgnoreCase(trim)) {
                                    float parseFloat = Float.parseFloat(trim2);
                                    if (obj instanceof o11) {
                                        o11 o11Var3 = (o11) obj;
                                        if (i3 == 0) {
                                            ((ViewGroup.MarginLayoutParams) o11Var3).width = 0;
                                            o11Var3.H = parseFloat;
                                            return;
                                        }
                                        ((ViewGroup.MarginLayoutParams) o11Var3).height = 0;
                                        o11Var3.I = parseFloat;
                                    } else if (obj instanceof v11) {
                                        v11 v11Var2 = (v11) obj;
                                        if (i3 == 0) {
                                            v11Var2.c = 0;
                                            v11Var2.V = parseFloat;
                                            return;
                                        }
                                        v11Var2.d = 0;
                                        v11Var2.U = parseFloat;
                                    } else if (obj instanceof t11) {
                                        t11 t11Var2 = (t11) obj;
                                        if (i3 == 0) {
                                            t11Var2.b(23, 0);
                                            t11Var2.a(39, parseFloat);
                                            return;
                                        }
                                        t11Var2.b(21, 0);
                                        t11Var2.a(40, parseFloat);
                                    }
                                } else if ("parent".equalsIgnoreCase(trim)) {
                                    float max = Math.max((float) RecyclerView.B1, Math.min(1.0f, Float.parseFloat(trim2)));
                                    if (obj instanceof o11) {
                                        o11 o11Var4 = (o11) obj;
                                        if (i3 == 0) {
                                            ((ViewGroup.MarginLayoutParams) o11Var4).width = 0;
                                            o11Var4.R = max;
                                            o11Var4.L = 2;
                                            return;
                                        }
                                        ((ViewGroup.MarginLayoutParams) o11Var4).height = 0;
                                        o11Var4.S = max;
                                        o11Var4.M = 2;
                                    } else if (obj instanceof v11) {
                                        v11 v11Var3 = (v11) obj;
                                        if (i3 == 0) {
                                            v11Var3.c = 0;
                                            v11Var3.e0 = max;
                                            v11Var3.Y = 2;
                                            return;
                                        }
                                        v11Var3.d = 0;
                                        v11Var3.f0 = max;
                                        v11Var3.Z = 2;
                                    } else if (obj instanceof t11) {
                                        t11 t11Var3 = (t11) obj;
                                        if (i3 == 0) {
                                            t11Var3.b(23, 0);
                                            t11Var3.b(54, 2);
                                            return;
                                        }
                                        t11Var3.b(21, 0);
                                        t11Var3.b(55, 2);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    public static void n(o11 o11Var, String str) {
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
                        if (parseFloat > RecyclerView.B1 && parseFloat2 > RecyclerView.B1) {
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
        o11Var.G = str;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [t11, java.lang.Object] */
    public static void o(u11 u11Var, TypedArray typedArray) {
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
        u11Var.h = obj;
        w11 w11Var = u11Var.d;
        w11Var.a = false;
        v11 v11Var = u11Var.e;
        v11Var.b = false;
        x11 x11Var = u11Var.c;
        x11Var.a = false;
        y11 y11Var = u11Var.f;
        y11Var.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i3) {
                case 2:
                    c = 5;
                    obj.b(2, typedArray.getDimensionPixelSize(index, v11Var.J));
                    continue;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case SubAllocator.N4 /* 26 */:
                case 29:
                case 30:
                case 32:
                case 33:
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
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
                case 6:
                    obj.b(6, typedArray.getDimensionPixelOffset(index, v11Var.D));
                    break;
                case 7:
                    obj.b(7, typedArray.getDimensionPixelOffset(index, v11Var.E));
                    break;
                case 8:
                    obj.b(8, typedArray.getDimensionPixelSize(index, v11Var.K));
                    break;
                case 11:
                    obj.b(11, typedArray.getDimensionPixelSize(index, v11Var.Q));
                    break;
                case 12:
                    obj.b(12, typedArray.getDimensionPixelSize(index, v11Var.R));
                    break;
                case 13:
                    obj.b(13, typedArray.getDimensionPixelSize(index, v11Var.N));
                    break;
                case 14:
                    obj.b(14, typedArray.getDimensionPixelSize(index, v11Var.P));
                    break;
                case 15:
                    obj.b(15, typedArray.getDimensionPixelSize(index, v11Var.S));
                    break;
                case 16:
                    obj.b(16, typedArray.getDimensionPixelSize(index, v11Var.O));
                    break;
                case 17:
                    obj.b(17, typedArray.getDimensionPixelOffset(index, v11Var.e));
                    break;
                case 18:
                    obj.b(18, typedArray.getDimensionPixelOffset(index, v11Var.f));
                    break;
                case 19:
                    obj.a(19, typedArray.getFloat(index, v11Var.g));
                    break;
                case 20:
                    obj.a(20, typedArray.getFloat(index, v11Var.x));
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    obj.b(21, typedArray.getLayoutDimension(index, v11Var.d));
                    break;
                case 22:
                    obj.b(22, h[typedArray.getInt(index, x11Var.b)]);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    obj.b(23, typedArray.getLayoutDimension(index, v11Var.c));
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    obj.b(24, typedArray.getDimensionPixelSize(index, v11Var.G));
                    break;
                case 27:
                    obj.b(27, typedArray.getInt(index, v11Var.F));
                    break;
                case 28:
                    obj.b(28, typedArray.getDimensionPixelSize(index, v11Var.H));
                    break;
                case 31:
                    obj.b(31, typedArray.getDimensionPixelSize(index, v11Var.L));
                    break;
                case 34:
                    obj.b(34, typedArray.getDimensionPixelSize(index, v11Var.I));
                    break;
                case 37:
                    obj.a(37, typedArray.getFloat(index, v11Var.y));
                    break;
                case SubAllocator.N_INDEXES /* 38 */:
                    int resourceId = typedArray.getResourceId(index, u11Var.a);
                    u11Var.a = resourceId;
                    obj.b(38, resourceId);
                    break;
                case 39:
                    obj.a(39, typedArray.getFloat(index, v11Var.V));
                    break;
                case 40:
                    obj.a(40, typedArray.getFloat(index, v11Var.U));
                    break;
                case 41:
                    obj.b(41, typedArray.getInt(index, v11Var.W));
                    break;
                case 42:
                    obj.b(42, typedArray.getInt(index, v11Var.X));
                    break;
                case 43:
                    obj.a(43, typedArray.getFloat(index, x11Var.d));
                    break;
                case 44:
                    obj.d(44, true);
                    obj.a(44, typedArray.getDimension(index, y11Var.n));
                    break;
                case 45:
                    obj.a(45, typedArray.getFloat(index, y11Var.c));
                    break;
                case 46:
                    obj.a(46, typedArray.getFloat(index, y11Var.d));
                    break;
                case 47:
                    obj.a(47, typedArray.getFloat(index, y11Var.e));
                    break;
                case Compress.DC20 /* 48 */:
                    obj.a(48, typedArray.getFloat(index, y11Var.f));
                    break;
                case 49:
                    obj.a(49, typedArray.getDimension(index, y11Var.g));
                    break;
                case 50:
                    obj.a(50, typedArray.getDimension(index, y11Var.h));
                    break;
                case 51:
                    obj.a(51, typedArray.getDimension(index, y11Var.j));
                    break;
                case 52:
                    obj.a(52, typedArray.getDimension(index, y11Var.k));
                    break;
                case 53:
                    obj.a(53, typedArray.getDimension(index, y11Var.l));
                    break;
                case 54:
                    obj.b(54, typedArray.getInt(index, v11Var.Y));
                    break;
                case 55:
                    obj.b(55, typedArray.getInt(index, v11Var.Z));
                    break;
                case 56:
                    obj.b(56, typedArray.getDimensionPixelSize(index, v11Var.a0));
                    break;
                case 57:
                    obj.b(57, typedArray.getDimensionPixelSize(index, v11Var.b0));
                    break;
                case 58:
                    obj.b(58, typedArray.getDimensionPixelSize(index, v11Var.c0));
                    break;
                case 59:
                    obj.b(59, typedArray.getDimensionPixelSize(index, v11Var.d0));
                    break;
                case Compress.DC /* 60 */:
                    obj.a(60, typedArray.getFloat(index, y11Var.b));
                    break;
                case 62:
                    obj.b(62, typedArray.getDimensionPixelSize(index, v11Var.B));
                    break;
                case 63:
                    obj.a(63, typedArray.getFloat(index, v11Var.C));
                    break;
                case 64:
                    obj.b(64, l(typedArray, index, w11Var.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        obj.c(65, typedArray.getString(index));
                        break;
                    } else {
                        obj.c(65, gr1.R[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    obj.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    obj.a(67, typedArray.getFloat(index, w11Var.h));
                    break;
                case 68:
                    obj.a(68, typedArray.getFloat(index, x11Var.e));
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
                    obj.b(72, typedArray.getInt(index, v11Var.g0));
                    break;
                case 73:
                    obj.b(73, typedArray.getDimensionPixelSize(index, v11Var.h0));
                    break;
                case 74:
                    obj.c(74, typedArray.getString(index));
                    break;
                case 75:
                    obj.d(75, typedArray.getBoolean(index, v11Var.o0));
                    break;
                case 76:
                    obj.b(76, typedArray.getInt(index, w11Var.e));
                    break;
                case 77:
                    obj.c(77, typedArray.getString(index));
                    break;
                case 78:
                    obj.b(78, typedArray.getInt(index, x11Var.c));
                    break;
                case 79:
                    obj.a(79, typedArray.getFloat(index, w11Var.g));
                    break;
                case 80:
                    obj.d(80, typedArray.getBoolean(index, v11Var.m0));
                    break;
                case 81:
                    obj.d(81, typedArray.getBoolean(index, v11Var.n0));
                    break;
                case 82:
                    obj.b(82, typedArray.getInteger(index, w11Var.c));
                    break;
                case 83:
                    obj.b(83, l(typedArray, index, y11Var.i));
                    break;
                case 84:
                    obj.b(84, typedArray.getInteger(index, w11Var.j));
                    break;
                case 85:
                    obj.a(85, typedArray.getFloat(index, w11Var.i));
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        w11Var.m = resourceId2;
                        obj.b(89, resourceId2);
                        if (w11Var.m != -1) {
                            w11Var.l = -2;
                            obj.b(88, -2);
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        w11Var.k = string;
                        obj.c(90, string);
                        if (w11Var.k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            w11Var.m = resourceId3;
                            obj.b(89, resourceId3);
                            w11Var.l = -2;
                            obj.b(88, -2);
                        } else {
                            w11Var.l = -1;
                            obj.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, w11Var.m);
                        w11Var.l = integer;
                        obj.b(88, integer);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    obj.b(93, typedArray.getDimensionPixelSize(index, v11Var.M));
                    break;
                case 94:
                    obj.b(94, typedArray.getDimensionPixelSize(index, v11Var.T));
                    break;
                case 95:
                    m(obj, typedArray, index, 0);
                    break;
                case 96:
                    m(obj, typedArray, index, 1);
                    break;
                case 97:
                    obj.b(97, typedArray.getInt(index, v11Var.p0));
                    break;
                case 98:
                    if (MotionLayout.t1) {
                        int resourceId4 = typedArray.getResourceId(index, u11Var.a);
                        u11Var.a = resourceId4;
                        if (resourceId4 == -1) {
                            u11Var.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        u11Var.b = typedArray.getString(index);
                    } else {
                        u11Var.a = typedArray.getResourceId(index, u11Var.a);
                    }
                    break;
                case 99:
                    obj.d(99, typedArray.getBoolean(index, v11Var.h));
                    break;
            }
            c = 5;
        }
    }

    public final void a(MotionLayout motionLayout) {
        u11 u11Var;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer valueOf = Integer.valueOf(id);
            HashMap hashMap = this.g;
            if (!hashMap.containsKey(valueOf)) {
                Log.w("ConstraintSet", "id unknown " + lb4.y(childAt));
            } else if (this.f && id == -1) {
                u34.j("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (hashMap.containsKey(Integer.valueOf(id)) && (u11Var = (u11) hashMap.get(Integer.valueOf(id))) != null) {
                j11.e(childAt, u11Var.g);
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
                Log.w("ConstraintSet", "id unknown " + lb4.y(childAt));
            } else if (this.f && id == -1) {
                u34.j("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (id != -1) {
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    u11 u11Var = (u11) hashMap.get(Integer.valueOf(id));
                    if (u11Var != null) {
                        x11 x11Var = u11Var.c;
                        v11 v11Var = u11Var.e;
                        y11 y11Var = u11Var.f;
                        if (childAt instanceof Barrier) {
                            v11Var.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(v11Var.g0);
                            barrier.setMargin(v11Var.h0);
                            barrier.setAllowsGoneWidget(v11Var.o0);
                            int[] iArr = v11Var.j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = v11Var.k0;
                                if (str != null) {
                                    int[] f = f(barrier, str);
                                    v11Var.j0 = f;
                                    barrier.setReferencedIds(f);
                                }
                            }
                        }
                        o11 o11Var = (o11) childAt.getLayoutParams();
                        o11Var.a();
                        u11Var.b(o11Var);
                        j11.e(childAt, u11Var.g);
                        childAt.setLayoutParams(o11Var);
                        if (x11Var.c == 0) {
                            childAt.setVisibility(x11Var.b);
                        }
                        childAt.setAlpha(x11Var.d);
                        childAt.setRotation(y11Var.b);
                        childAt.setRotationX(y11Var.c);
                        childAt.setRotationY(y11Var.d);
                        childAt.setScaleX(y11Var.e);
                        childAt.setScaleY(y11Var.f);
                        if (y11Var.i != -1) {
                            if (((View) childAt.getParent()).findViewById(y11Var.i) != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(y11Var.g)) {
                                childAt.setPivotX(y11Var.g);
                            }
                            if (!Float.isNaN(y11Var.h)) {
                                childAt.setPivotY(y11Var.h);
                            }
                        }
                        childAt.setTranslationX(y11Var.j);
                        childAt.setTranslationY(y11Var.k);
                        childAt.setTranslationZ(y11Var.l);
                        if (y11Var.m) {
                            childAt.setElevation(y11Var.n);
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
            u11 u11Var2 = (u11) hashMap.get(num);
            if (u11Var2 != null) {
                v11 v11Var2 = u11Var2.e;
                if (v11Var2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = v11Var2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = v11Var2.k0;
                        if (str2 != null) {
                            int[] f2 = f(barrier2, str2);
                            v11Var2.j0 = f2;
                            barrier2.setReferencedIds(f2);
                        }
                    }
                    barrier2.setType(v11Var2.g0);
                    barrier2.setMargin(v11Var2.h0);
                    bh6 bh6Var = ConstraintLayout.o0;
                    o11 o11Var2 = new o11();
                    barrier2.k();
                    u11Var2.b(o11Var2);
                    constraintLayout.addView(barrier2, o11Var2);
                }
                if (v11Var2.a) {
                    View zu2Var = new zu2(constraintLayout.getContext());
                    zu2Var.setId(num.intValue());
                    bh6 bh6Var2 = ConstraintLayout.o0;
                    o11 o11Var3 = new o11();
                    u11Var2.b(o11Var3);
                    constraintLayout.addView(zu2Var, o11Var3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof l11) {
                ((l11) childAt2).e(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i2;
        HashMap hashMap;
        int i3;
        z11 z11Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = z11Var.g;
        hashMap2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            o11 o11Var = (o11) childAt.getLayoutParams();
            int id = childAt.getId();
            if (z11Var.f && id == -1) {
                u34.j("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new u11());
            }
            u11 u11Var = (u11) hashMap2.get(Integer.valueOf(id));
            if (u11Var == null) {
                i2 = childCount;
                hashMap = hashMap2;
                i3 = i4;
            } else {
                x11 x11Var = u11Var.c;
                v11 v11Var = u11Var.e;
                y11 y11Var = u11Var.f;
                i2 = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i3 = i4;
                HashMap hashMap4 = z11Var.e;
                for (String str : hashMap4.keySet()) {
                    j11 j11Var = (j11) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new j11(j11Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new j11(j11Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder t = i61.t(" Custom Attribute \"", str, "\" not found on ");
                        t.append(cls.getName());
                        Log.e("TransitionLayout", t.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder t2 = i61.t(" Custom Attribute \"", str, "\" not found on ");
                        t2.append(cls.getName());
                        Log.e("TransitionLayout", t2.toString(), e3);
                    }
                    hashMap4 = hashMap5;
                }
                u11Var.g = hashMap3;
                u11.a(u11Var, id, o11Var);
                x11Var.b = childAt.getVisibility();
                x11Var.d = childAt.getAlpha();
                y11Var.b = childAt.getRotation();
                y11Var.c = childAt.getRotationX();
                y11Var.d = childAt.getRotationY();
                y11Var.e = childAt.getScaleX();
                y11Var.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    y11Var.g = pivotX;
                    y11Var.h = pivotY;
                }
                y11Var.j = childAt.getTranslationX();
                y11Var.k = childAt.getTranslationY();
                y11Var.l = childAt.getTranslationZ();
                if (y11Var.m) {
                    y11Var.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    v11Var.o0 = barrier.getAllowsGoneWidget();
                    v11Var.j0 = barrier.getReferencedIds();
                    v11Var.g0 = barrier.getType();
                    v11Var.h0 = barrier.getMargin();
                }
            }
            i4 = i3 + 1;
            z11Var = this;
            childCount = i2;
            hashMap2 = hashMap;
        }
    }

    public final u11 h(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new u11());
        }
        return (u11) hashMap.get(Integer.valueOf(i2));
    }

    public final u11 i(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (hashMap.containsKey(valueOf)) {
            return (u11) hashMap.get(Integer.valueOf(i2));
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
                    u11 g = g(context, Xml.asAttributeSet(xml), false);
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
    */
    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            u11 u11Var = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (!lowerCase.equals("guideline")) {
                                        break;
                                    }
                                    this.g.put(Integer.valueOf(u11Var.a), u11Var);
                                    u11Var = null;
                                    break;
                                case -190376483:
                                    if (!lowerCase.equals("constraint")) {
                                        break;
                                    } else {
                                        this.g.put(Integer.valueOf(u11Var.a), u11Var);
                                        u11Var = null;
                                        break;
                                    }
                                case 426575017:
                                    if (!lowerCase.equals("constraintoverride")) {
                                        break;
                                    } else {
                                        this.g.put(Integer.valueOf(u11Var.a), u11Var);
                                        u11Var = null;
                                        break;
                                    }
                                case 2146106725:
                                    if (!lowerCase.equals("constraintset")) {
                                        break;
                                    } else {
                                        return;
                                    }
                            }
                        }
                    } else {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (!name.equals("Layout")) {
                                    continue;
                                } else if (u11Var != null) {
                                    u11Var.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case -1984451626:
                                if (!name.equals("Motion")) {
                                    continue;
                                } else if (u11Var != null) {
                                    u11Var.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case -1962203927:
                                if (!name.equals("ConstraintOverride")) {
                                    break;
                                } else {
                                    u11Var = g(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                }
                            case -1269513683:
                                if (!name.equals("PropertySet")) {
                                    continue;
                                } else if (u11Var != null) {
                                    u11Var.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case -1238332596:
                                if (!name.equals("Transform")) {
                                    continue;
                                } else if (u11Var != null) {
                                    u11Var.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case -71750448:
                                if (!name.equals("Guideline")) {
                                    break;
                                } else {
                                    u11Var = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    v11 v11Var = u11Var.e;
                                    v11Var.a = true;
                                    v11Var.b = true;
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (u11Var == null) {
                                    j11.d(context, xmlResourceParser, u11Var.g);
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                            case 1331510167:
                                if (!name.equals("Barrier")) {
                                    break;
                                } else {
                                    u11Var = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    u11Var.e.i0 = 1;
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (u11Var == null) {
                                }
                                break;
                            case 1803088381:
                                if (!name.equals("Constraint")) {
                                    break;
                                } else {
                                    u11Var = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                }
                        }
                    }
                } else {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }
}
