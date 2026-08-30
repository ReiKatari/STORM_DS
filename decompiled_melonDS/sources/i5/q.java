package i5;

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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f6983h = {0, 4, 8};

    /* renamed from: i  reason: collision with root package name */
    public static final SparseIntArray f6984i;

    /* renamed from: j  reason: collision with root package name */
    public static final SparseIntArray f6985j;

    /* renamed from: a  reason: collision with root package name */
    public String f6986a;

    /* renamed from: b  reason: collision with root package name */
    public String f6987b = "";

    /* renamed from: c  reason: collision with root package name */
    public String[] f6988c = new String[0];

    /* renamed from: d  reason: collision with root package name */
    public int f6989d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f6990e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public boolean f6991f = true;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f6992g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6984i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f6985j = sparseIntArray2;
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

    public static l d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        l lVar = new l();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, v.f6995c);
        o(lVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return lVar;
    }

    public static int[] f(Barrier barrier, String str) {
        int i2;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            Object obj = null;
            try {
                i2 = u.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1164j0;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1164j0.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i2 = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = i2;
            i10++;
            i11++;
        }
        if (i11 != split.length) {
            return Arrays.copyOf(iArr, i11);
        }
        return iArr;
    }

    public static l g(Context context, AttributeSet attributeSet, boolean z10) {
        int[] iArr;
        SparseIntArray sparseIntArray;
        l lVar = new l();
        if (z10) {
            iArr = v.f6995c;
        } else {
            iArr = v.f6993a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z10) {
            o(lVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                m mVar = lVar.f6906e;
                if (i2 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i2);
                    o oVar = lVar.f6904c;
                    p pVar = lVar.f6907f;
                    n nVar = lVar.f6905d;
                    if (index != 1 && 23 != index && 24 != index) {
                        nVar.f6952a = true;
                        mVar.f6913b = true;
                        oVar.f6964a = true;
                        pVar.f6970a = true;
                    }
                    switch (f6984i.get(index)) {
                        case DSiCameraSource.FrontCamera /* 1 */:
                            mVar.f6941q = l(obtainStyledAttributes, index, mVar.f6941q);
                            break;
                        case 2:
                            mVar.J = obtainStyledAttributes.getDimensionPixelSize(index, mVar.J);
                            break;
                        case 3:
                            mVar.f6940p = l(obtainStyledAttributes, index, mVar.f6940p);
                            break;
                        case 4:
                            mVar.f6938o = l(obtainStyledAttributes, index, mVar.f6938o);
                            break;
                        case l1.c.f8511g /* 5 */:
                            mVar.f6950z = obtainStyledAttributes.getString(index);
                            break;
                        case l1.c.f8509e /* 6 */:
                            mVar.D = obtainStyledAttributes.getDimensionPixelOffset(index, mVar.D);
                            break;
                        case 7:
                            mVar.E = obtainStyledAttributes.getDimensionPixelOffset(index, mVar.E);
                            break;
                        case 8:
                            mVar.K = obtainStyledAttributes.getDimensionPixelSize(index, mVar.K);
                            break;
                        case l1.c.f8508d /* 9 */:
                            mVar.f6947w = l(obtainStyledAttributes, index, mVar.f6947w);
                            break;
                        case l1.c.f8510f /* 10 */:
                            mVar.f6946v = l(obtainStyledAttributes, index, mVar.f6946v);
                            break;
                        case 11:
                            mVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, mVar.Q);
                            break;
                        case 12:
                            mVar.R = obtainStyledAttributes.getDimensionPixelSize(index, mVar.R);
                            break;
                        case 13:
                            mVar.N = obtainStyledAttributes.getDimensionPixelSize(index, mVar.N);
                            break;
                        case 14:
                            mVar.P = obtainStyledAttributes.getDimensionPixelSize(index, mVar.P);
                            break;
                        case l1.c.f8512h /* 15 */:
                            mVar.S = obtainStyledAttributes.getDimensionPixelSize(index, mVar.S);
                            break;
                        case 16:
                            mVar.O = obtainStyledAttributes.getDimensionPixelSize(index, mVar.O);
                            break;
                        case 17:
                            mVar.f6919e = obtainStyledAttributes.getDimensionPixelOffset(index, mVar.f6919e);
                            break;
                        case 18:
                            mVar.f6921f = obtainStyledAttributes.getDimensionPixelOffset(index, mVar.f6921f);
                            break;
                        case 19:
                            mVar.f6923g = obtainStyledAttributes.getFloat(index, mVar.f6923g);
                            break;
                        case 20:
                            mVar.f6948x = obtainStyledAttributes.getFloat(index, mVar.f6948x);
                            break;
                        case 21:
                            mVar.f6917d = obtainStyledAttributes.getLayoutDimension(index, mVar.f6917d);
                            break;
                        case 22:
                            int i10 = obtainStyledAttributes.getInt(index, oVar.f6965b);
                            oVar.f6965b = i10;
                            oVar.f6965b = f6983h[i10];
                            break;
                        case 23:
                            mVar.f6915c = obtainStyledAttributes.getLayoutDimension(index, mVar.f6915c);
                            break;
                        case 24:
                            mVar.G = obtainStyledAttributes.getDimensionPixelSize(index, mVar.G);
                            break;
                        case 25:
                            mVar.f6927i = l(obtainStyledAttributes, index, mVar.f6927i);
                            break;
                        case 26:
                            mVar.f6929j = l(obtainStyledAttributes, index, mVar.f6929j);
                            break;
                        case 27:
                            mVar.F = obtainStyledAttributes.getInt(index, mVar.F);
                            break;
                        case 28:
                            mVar.H = obtainStyledAttributes.getDimensionPixelSize(index, mVar.H);
                            break;
                        case 29:
                            mVar.f6931k = l(obtainStyledAttributes, index, mVar.f6931k);
                            break;
                        case 30:
                            mVar.f6933l = l(obtainStyledAttributes, index, mVar.f6933l);
                            break;
                        case 31:
                            mVar.L = obtainStyledAttributes.getDimensionPixelSize(index, mVar.L);
                            break;
                        case 32:
                            mVar.f6944t = l(obtainStyledAttributes, index, mVar.f6944t);
                            break;
                        case 33:
                            mVar.f6945u = l(obtainStyledAttributes, index, mVar.f6945u);
                            break;
                        case 34:
                            mVar.I = obtainStyledAttributes.getDimensionPixelSize(index, mVar.I);
                            break;
                        case 35:
                            mVar.f6936n = l(obtainStyledAttributes, index, mVar.f6936n);
                            break;
                        case 36:
                            mVar.m = l(obtainStyledAttributes, index, mVar.m);
                            break;
                        case 37:
                            mVar.f6949y = obtainStyledAttributes.getFloat(index, mVar.f6949y);
                            break;
                        case 38:
                            lVar.f6902a = obtainStyledAttributes.getResourceId(index, lVar.f6902a);
                            break;
                        case 39:
                            mVar.V = obtainStyledAttributes.getFloat(index, mVar.V);
                            break;
                        case 40:
                            mVar.U = obtainStyledAttributes.getFloat(index, mVar.U);
                            break;
                        case 41:
                            mVar.W = obtainStyledAttributes.getInt(index, mVar.W);
                            break;
                        case 42:
                            mVar.X = obtainStyledAttributes.getInt(index, mVar.X);
                            break;
                        case 43:
                            oVar.f6967d = obtainStyledAttributes.getFloat(index, oVar.f6967d);
                            break;
                        case 44:
                            pVar.m = true;
                            pVar.f6982n = obtainStyledAttributes.getDimension(index, pVar.f6982n);
                            break;
                        case 45:
                            pVar.f6972c = obtainStyledAttributes.getFloat(index, pVar.f6972c);
                            break;
                        case 46:
                            pVar.f6973d = obtainStyledAttributes.getFloat(index, pVar.f6973d);
                            break;
                        case 47:
                            pVar.f6974e = obtainStyledAttributes.getFloat(index, pVar.f6974e);
                            break;
                        case 48:
                            pVar.f6975f = obtainStyledAttributes.getFloat(index, pVar.f6975f);
                            break;
                        case 49:
                            pVar.f6976g = obtainStyledAttributes.getDimension(index, pVar.f6976g);
                            break;
                        case 50:
                            pVar.f6977h = obtainStyledAttributes.getDimension(index, pVar.f6977h);
                            break;
                        case 51:
                            pVar.f6979j = obtainStyledAttributes.getDimension(index, pVar.f6979j);
                            break;
                        case 52:
                            pVar.f6980k = obtainStyledAttributes.getDimension(index, pVar.f6980k);
                            break;
                        case 53:
                            pVar.f6981l = obtainStyledAttributes.getDimension(index, pVar.f6981l);
                            break;
                        case 54:
                            mVar.Y = obtainStyledAttributes.getInt(index, mVar.Y);
                            break;
                        case 55:
                            mVar.Z = obtainStyledAttributes.getInt(index, mVar.Z);
                            break;
                        case 56:
                            mVar.f6912a0 = obtainStyledAttributes.getDimensionPixelSize(index, mVar.f6912a0);
                            break;
                        case 57:
                            mVar.f6914b0 = obtainStyledAttributes.getDimensionPixelSize(index, mVar.f6914b0);
                            break;
                        case 58:
                            mVar.f6916c0 = obtainStyledAttributes.getDimensionPixelSize(index, mVar.f6916c0);
                            break;
                        case 59:
                            mVar.f6918d0 = obtainStyledAttributes.getDimensionPixelSize(index, mVar.f6918d0);
                            break;
                        case 60:
                            pVar.f6971b = obtainStyledAttributes.getFloat(index, pVar.f6971b);
                            break;
                        case 61:
                            mVar.A = l(obtainStyledAttributes, index, mVar.A);
                            break;
                        case 62:
                            mVar.B = obtainStyledAttributes.getDimensionPixelSize(index, mVar.B);
                            break;
                        case 63:
                            mVar.C = obtainStyledAttributes.getFloat(index, mVar.C);
                            break;
                        case 64:
                            nVar.f6953b = l(obtainStyledAttributes, index, nVar.f6953b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type == 3) {
                                nVar.f6955d = obtainStyledAttributes.getString(index);
                                break;
                            } else {
                                nVar.f6955d = d5.e.f3836d[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            }
                        case 66:
                            nVar.f6957f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            nVar.f6959h = obtainStyledAttributes.getFloat(index, nVar.f6959h);
                            break;
                        case 68:
                            oVar.f6968e = obtainStyledAttributes.getFloat(index, oVar.f6968e);
                            break;
                        case 69:
                            mVar.f6920e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            mVar.f6922f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            mVar.f6924g0 = obtainStyledAttributes.getInt(index, mVar.f6924g0);
                            break;
                        case 73:
                            mVar.f6926h0 = obtainStyledAttributes.getDimensionPixelSize(index, mVar.f6926h0);
                            break;
                        case 74:
                            mVar.f6932k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            mVar.f6939o0 = obtainStyledAttributes.getBoolean(index, mVar.f6939o0);
                            break;
                        case 76:
                            nVar.f6956e = obtainStyledAttributes.getInt(index, nVar.f6956e);
                            break;
                        case 77:
                            mVar.f6934l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            oVar.f6966c = obtainStyledAttributes.getInt(index, oVar.f6966c);
                            break;
                        case 79:
                            nVar.f6958g = obtainStyledAttributes.getFloat(index, nVar.f6958g);
                            break;
                        case 80:
                            mVar.f6935m0 = obtainStyledAttributes.getBoolean(index, mVar.f6935m0);
                            break;
                        case 81:
                            mVar.f6937n0 = obtainStyledAttributes.getBoolean(index, mVar.f6937n0);
                            break;
                        case 82:
                            nVar.f6954c = obtainStyledAttributes.getInteger(index, nVar.f6954c);
                            break;
                        case 83:
                            pVar.f6978i = l(obtainStyledAttributes, index, pVar.f6978i);
                            break;
                        case 84:
                            nVar.f6961j = obtainStyledAttributes.getInteger(index, nVar.f6961j);
                            break;
                        case 85:
                            nVar.f6960i = obtainStyledAttributes.getFloat(index, nVar.f6960i);
                            break;
                        case 86:
                            int i11 = obtainStyledAttributes.peekValue(index).type;
                            if (i11 == 1) {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                nVar.m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    nVar.f6963l = -2;
                                    break;
                                }
                            } else if (i11 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                nVar.f6962k = string;
                                if (string.indexOf("/") > 0) {
                                    nVar.m = obtainStyledAttributes.getResourceId(index, -1);
                                    nVar.f6963l = -2;
                                    break;
                                } else {
                                    nVar.f6963l = -1;
                                    break;
                                }
                            } else {
                                nVar.f6963l = obtainStyledAttributes.getInteger(index, nVar.m);
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
                            mVar.f6942r = l(obtainStyledAttributes, index, mVar.f6942r);
                            break;
                        case 92:
                            mVar.f6943s = l(obtainStyledAttributes, index, mVar.f6943s);
                            break;
                        case 93:
                            mVar.M = obtainStyledAttributes.getDimensionPixelSize(index, mVar.M);
                            break;
                        case 94:
                            mVar.T = obtainStyledAttributes.getDimensionPixelSize(index, mVar.T);
                            break;
                        case 95:
                            m(mVar, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m(mVar, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            mVar.p0 = obtainStyledAttributes.getInt(index, mVar.p0);
                            break;
                    }
                    i2++;
                } else if (mVar.f6932k0 != null) {
                    mVar.f6930j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return lVar;
    }

    public static int l(TypedArray typedArray, int i2, int i10) {
        int resourceId = typedArray.getResourceId(i2, i10);
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
        throw new UnsupportedOperationException("Method not decompiled: i5.q.m(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void n(f fVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i10 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                }
                i10 = i2;
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
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i10 == 1) {
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
        fVar.G = str;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [i5.k, java.lang.Object] */
    public static void o(l lVar, TypedArray typedArray) {
        char c4;
        int indexCount = typedArray.getIndexCount();
        ?? obj = new Object();
        obj.f6890a = new int[10];
        obj.f6891b = new int[10];
        obj.f6892c = 0;
        obj.f6893d = new int[10];
        obj.f6894e = new float[10];
        obj.f6895f = 0;
        obj.f6896g = new int[5];
        obj.f6897h = new String[5];
        obj.f6898i = 0;
        obj.f6899j = new int[4];
        obj.f6900k = new boolean[4];
        obj.f6901l = 0;
        lVar.f6909h = obj;
        n nVar = lVar.f6905d;
        nVar.f6952a = false;
        m mVar = lVar.f6906e;
        mVar.f6913b = false;
        o oVar = lVar.f6904c;
        oVar.f6964a = false;
        p pVar = lVar.f6907f;
        pVar.f6970a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i10 = f6985j.get(index);
            SparseIntArray sparseIntArray = f6984i;
            switch (i10) {
                case 2:
                    c4 = 5;
                    obj.b(2, typedArray.getDimensionPixelSize(index, mVar.J));
                    continue;
                case 3:
                case 4:
                case l1.c.f8508d /* 9 */:
                case l1.c.f8510f /* 10 */:
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
                case l1.c.f8511g /* 5 */:
                    c4 = 5;
                    obj.c(5, typedArray.getString(index));
                    continue;
                case l1.c.f8509e /* 6 */:
                    obj.b(6, typedArray.getDimensionPixelOffset(index, mVar.D));
                    break;
                case 7:
                    obj.b(7, typedArray.getDimensionPixelOffset(index, mVar.E));
                    break;
                case 8:
                    obj.b(8, typedArray.getDimensionPixelSize(index, mVar.K));
                    break;
                case 11:
                    obj.b(11, typedArray.getDimensionPixelSize(index, mVar.Q));
                    break;
                case 12:
                    obj.b(12, typedArray.getDimensionPixelSize(index, mVar.R));
                    break;
                case 13:
                    obj.b(13, typedArray.getDimensionPixelSize(index, mVar.N));
                    break;
                case 14:
                    obj.b(14, typedArray.getDimensionPixelSize(index, mVar.P));
                    break;
                case l1.c.f8512h /* 15 */:
                    obj.b(15, typedArray.getDimensionPixelSize(index, mVar.S));
                    break;
                case 16:
                    obj.b(16, typedArray.getDimensionPixelSize(index, mVar.O));
                    break;
                case 17:
                    obj.b(17, typedArray.getDimensionPixelOffset(index, mVar.f6919e));
                    break;
                case 18:
                    obj.b(18, typedArray.getDimensionPixelOffset(index, mVar.f6921f));
                    break;
                case 19:
                    obj.a(19, typedArray.getFloat(index, mVar.f6923g));
                    break;
                case 20:
                    obj.a(20, typedArray.getFloat(index, mVar.f6948x));
                    break;
                case 21:
                    obj.b(21, typedArray.getLayoutDimension(index, mVar.f6917d));
                    break;
                case 22:
                    obj.b(22, f6983h[typedArray.getInt(index, oVar.f6965b)]);
                    break;
                case 23:
                    obj.b(23, typedArray.getLayoutDimension(index, mVar.f6915c));
                    break;
                case 24:
                    obj.b(24, typedArray.getDimensionPixelSize(index, mVar.G));
                    break;
                case 27:
                    obj.b(27, typedArray.getInt(index, mVar.F));
                    break;
                case 28:
                    obj.b(28, typedArray.getDimensionPixelSize(index, mVar.H));
                    break;
                case 31:
                    obj.b(31, typedArray.getDimensionPixelSize(index, mVar.L));
                    break;
                case 34:
                    obj.b(34, typedArray.getDimensionPixelSize(index, mVar.I));
                    break;
                case 37:
                    obj.a(37, typedArray.getFloat(index, mVar.f6949y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, lVar.f6902a);
                    lVar.f6902a = resourceId;
                    obj.b(38, resourceId);
                    break;
                case 39:
                    obj.a(39, typedArray.getFloat(index, mVar.V));
                    break;
                case 40:
                    obj.a(40, typedArray.getFloat(index, mVar.U));
                    break;
                case 41:
                    obj.b(41, typedArray.getInt(index, mVar.W));
                    break;
                case 42:
                    obj.b(42, typedArray.getInt(index, mVar.X));
                    break;
                case 43:
                    obj.a(43, typedArray.getFloat(index, oVar.f6967d));
                    break;
                case 44:
                    obj.d(44, true);
                    obj.a(44, typedArray.getDimension(index, pVar.f6982n));
                    break;
                case 45:
                    obj.a(45, typedArray.getFloat(index, pVar.f6972c));
                    break;
                case 46:
                    obj.a(46, typedArray.getFloat(index, pVar.f6973d));
                    break;
                case 47:
                    obj.a(47, typedArray.getFloat(index, pVar.f6974e));
                    break;
                case 48:
                    obj.a(48, typedArray.getFloat(index, pVar.f6975f));
                    break;
                case 49:
                    obj.a(49, typedArray.getDimension(index, pVar.f6976g));
                    break;
                case 50:
                    obj.a(50, typedArray.getDimension(index, pVar.f6977h));
                    break;
                case 51:
                    obj.a(51, typedArray.getDimension(index, pVar.f6979j));
                    break;
                case 52:
                    obj.a(52, typedArray.getDimension(index, pVar.f6980k));
                    break;
                case 53:
                    obj.a(53, typedArray.getDimension(index, pVar.f6981l));
                    break;
                case 54:
                    obj.b(54, typedArray.getInt(index, mVar.Y));
                    break;
                case 55:
                    obj.b(55, typedArray.getInt(index, mVar.Z));
                    break;
                case 56:
                    obj.b(56, typedArray.getDimensionPixelSize(index, mVar.f6912a0));
                    break;
                case 57:
                    obj.b(57, typedArray.getDimensionPixelSize(index, mVar.f6914b0));
                    break;
                case 58:
                    obj.b(58, typedArray.getDimensionPixelSize(index, mVar.f6916c0));
                    break;
                case 59:
                    obj.b(59, typedArray.getDimensionPixelSize(index, mVar.f6918d0));
                    break;
                case 60:
                    obj.a(60, typedArray.getFloat(index, pVar.f6971b));
                    break;
                case 62:
                    obj.b(62, typedArray.getDimensionPixelSize(index, mVar.B));
                    break;
                case 63:
                    obj.a(63, typedArray.getFloat(index, mVar.C));
                    break;
                case 64:
                    obj.b(64, l(typedArray, index, nVar.f6953b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        obj.c(65, typedArray.getString(index));
                        break;
                    } else {
                        obj.c(65, d5.e.f3836d[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    obj.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    obj.a(67, typedArray.getFloat(index, nVar.f6959h));
                    break;
                case 68:
                    obj.a(68, typedArray.getFloat(index, oVar.f6968e));
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
                    obj.b(72, typedArray.getInt(index, mVar.f6924g0));
                    break;
                case 73:
                    obj.b(73, typedArray.getDimensionPixelSize(index, mVar.f6926h0));
                    break;
                case 74:
                    obj.c(74, typedArray.getString(index));
                    break;
                case 75:
                    obj.d(75, typedArray.getBoolean(index, mVar.f6939o0));
                    break;
                case 76:
                    obj.b(76, typedArray.getInt(index, nVar.f6956e));
                    break;
                case 77:
                    obj.c(77, typedArray.getString(index));
                    break;
                case 78:
                    obj.b(78, typedArray.getInt(index, oVar.f6966c));
                    break;
                case 79:
                    obj.a(79, typedArray.getFloat(index, nVar.f6958g));
                    break;
                case 80:
                    obj.d(80, typedArray.getBoolean(index, mVar.f6935m0));
                    break;
                case 81:
                    obj.d(81, typedArray.getBoolean(index, mVar.f6937n0));
                    break;
                case 82:
                    obj.b(82, typedArray.getInteger(index, nVar.f6954c));
                    break;
                case 83:
                    obj.b(83, l(typedArray, index, pVar.f6978i));
                    break;
                case 84:
                    obj.b(84, typedArray.getInteger(index, nVar.f6961j));
                    break;
                case 85:
                    obj.a(85, typedArray.getFloat(index, nVar.f6960i));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        nVar.m = resourceId2;
                        obj.b(89, resourceId2);
                        if (nVar.m != -1) {
                            nVar.f6963l = -2;
                            obj.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        String string = typedArray.getString(index);
                        nVar.f6962k = string;
                        obj.c(90, string);
                        if (nVar.f6962k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            nVar.m = resourceId3;
                            obj.b(89, resourceId3);
                            nVar.f6963l = -2;
                            obj.b(88, -2);
                        } else {
                            nVar.f6963l = -1;
                            obj.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, nVar.m);
                        nVar.f6963l = integer;
                        obj.b(88, integer);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    obj.b(93, typedArray.getDimensionPixelSize(index, mVar.M));
                    break;
                case 94:
                    obj.b(94, typedArray.getDimensionPixelSize(index, mVar.T));
                    break;
                case 95:
                    m(obj, typedArray, index, 0);
                    break;
                case 96:
                    m(obj, typedArray, index, 1);
                    break;
                case 97:
                    obj.b(97, typedArray.getInt(index, mVar.p0));
                    break;
                case 98:
                    if (MotionLayout.f1074r1) {
                        int resourceId4 = typedArray.getResourceId(index, lVar.f6902a);
                        lVar.f6902a = resourceId4;
                        if (resourceId4 == -1) {
                            lVar.f6903b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        lVar.f6903b = typedArray.getString(index);
                    } else {
                        lVar.f6902a = typedArray.getResourceId(index, lVar.f6902a);
                    }
                    break;
                case 99:
                    obj.d(99, typedArray.getBoolean(index, mVar.f6925h));
                    break;
            }
            c4 = 5;
        }
    }

    public final void a(MotionLayout motionLayout) {
        l lVar;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id2 = childAt.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f6992g;
            if (!hashMap.containsKey(valueOf)) {
                Log.w("ConstraintSet", "id unknown " + d0.d.W(childAt));
            } else if (this.f6991f && id2 == -1) {
                m9.o.r("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (hashMap.containsKey(Integer.valueOf(id2)) && (lVar = (l) hashMap.get(Integer.valueOf(id2))) != null) {
                b.e(childAt, lVar.f6908g);
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
        HashMap hashMap = this.f6992g;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + d0.d.W(childAt));
            } else if (this.f6991f && id2 == -1) {
                m9.o.r("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (id2 != -1) {
                if (hashMap.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    l lVar = (l) hashMap.get(Integer.valueOf(id2));
                    if (lVar != null) {
                        o oVar = lVar.f6904c;
                        m mVar = lVar.f6906e;
                        p pVar = lVar.f6907f;
                        if (childAt instanceof Barrier) {
                            mVar.f6928i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(mVar.f6924g0);
                            barrier.setMargin(mVar.f6926h0);
                            barrier.setAllowsGoneWidget(mVar.f6939o0);
                            int[] iArr = mVar.f6930j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = mVar.f6932k0;
                                if (str != null) {
                                    int[] f8 = f(barrier, str);
                                    mVar.f6930j0 = f8;
                                    barrier.setReferencedIds(f8);
                                }
                            }
                        }
                        f fVar = (f) childAt.getLayoutParams();
                        fVar.a();
                        lVar.b(fVar);
                        b.e(childAt, lVar.f6908g);
                        childAt.setLayoutParams(fVar);
                        if (oVar.f6966c == 0) {
                            childAt.setVisibility(oVar.f6965b);
                        }
                        childAt.setAlpha(oVar.f6967d);
                        childAt.setRotation(pVar.f6971b);
                        childAt.setRotationX(pVar.f6972c);
                        childAt.setRotationY(pVar.f6973d);
                        childAt.setScaleX(pVar.f6974e);
                        childAt.setScaleY(pVar.f6975f);
                        if (pVar.f6978i != -1) {
                            if (((View) childAt.getParent()).findViewById(pVar.f6978i) != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(pVar.f6976g)) {
                                childAt.setPivotX(pVar.f6976g);
                            }
                            if (!Float.isNaN(pVar.f6977h)) {
                                childAt.setPivotY(pVar.f6977h);
                            }
                        }
                        childAt.setTranslationX(pVar.f6979j);
                        childAt.setTranslationY(pVar.f6980k);
                        childAt.setTranslationZ(pVar.f6981l);
                        if (pVar.m) {
                            childAt.setElevation(pVar.f6982n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            l lVar2 = (l) hashMap.get(num);
            if (lVar2 != null) {
                m mVar2 = lVar2.f6906e;
                if (mVar2.f6928i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = mVar2.f6930j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = mVar2.f6932k0;
                        if (str2 != null) {
                            int[] f10 = f(barrier2, str2);
                            mVar2.f6930j0 = f10;
                            barrier2.setReferencedIds(f10);
                        }
                    }
                    barrier2.setType(mVar2.f6924g0);
                    barrier2.setMargin(mVar2.f6926h0);
                    w wVar = ConstraintLayout.f1155m0;
                    f fVar2 = new f();
                    barrier2.k();
                    lVar2.b(fVar2);
                    constraintLayout.addView(barrier2, fVar2);
                }
                if (mVar2.f6911a) {
                    View tVar = new t(constraintLayout.getContext());
                    tVar.setId(num.intValue());
                    w wVar2 = ConstraintLayout.f1155m0;
                    f fVar3 = new f();
                    lVar2.b(fVar3);
                    constraintLayout.addView(tVar, fVar3);
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = constraintLayout.getChildAt(i10);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i2;
        HashMap hashMap;
        int i10;
        q qVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = qVar.f6992g;
        hashMap2.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (qVar.f6991f && id2 == -1) {
                m9.o.r("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                hashMap2.put(Integer.valueOf(id2), new l());
            }
            l lVar = (l) hashMap2.get(Integer.valueOf(id2));
            if (lVar == null) {
                i2 = childCount;
                hashMap = hashMap2;
                i10 = i11;
            } else {
                o oVar = lVar.f6904c;
                m mVar = lVar.f6906e;
                p pVar = lVar.f6907f;
                i2 = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i10 = i11;
                HashMap hashMap4 = qVar.f6990e;
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e6) {
                        StringBuilder u4 = w.d.u(" Custom Attribute \"", str, "\" not found on ");
                        u4.append(cls.getName());
                        Log.e("TransitionLayout", u4.toString(), e6);
                    } catch (NoSuchMethodException e10) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e10);
                    } catch (InvocationTargetException e11) {
                        StringBuilder u10 = w.d.u(" Custom Attribute \"", str, "\" not found on ");
                        u10.append(cls.getName());
                        Log.e("TransitionLayout", u10.toString(), e11);
                    }
                    hashMap4 = hashMap5;
                }
                lVar.f6908g = hashMap3;
                l.a(lVar, id2, fVar);
                oVar.f6965b = childAt.getVisibility();
                oVar.f6967d = childAt.getAlpha();
                pVar.f6971b = childAt.getRotation();
                pVar.f6972c = childAt.getRotationX();
                pVar.f6973d = childAt.getRotationY();
                pVar.f6974e = childAt.getScaleX();
                pVar.f6975f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    pVar.f6976g = pivotX;
                    pVar.f6977h = pivotY;
                }
                pVar.f6979j = childAt.getTranslationX();
                pVar.f6980k = childAt.getTranslationY();
                pVar.f6981l = childAt.getTranslationZ();
                if (pVar.m) {
                    pVar.f6982n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    mVar.f6939o0 = barrier.getAllowsGoneWidget();
                    mVar.f6930j0 = barrier.getReferencedIds();
                    mVar.f6924g0 = barrier.getType();
                    mVar.f6926h0 = barrier.getMargin();
                }
            }
            i11 = i10 + 1;
            qVar = this;
            childCount = i2;
            hashMap2 = hashMap;
        }
    }

    public final l h(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f6992g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new l());
        }
        return (l) hashMap.get(Integer.valueOf(i2));
    }

    public final l i(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.f6992g;
        if (hashMap.containsKey(valueOf)) {
            return (l) hashMap.get(Integer.valueOf(i2));
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
                    l g10 = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        g10.f6906e.f6911a = true;
                    }
                    this.f6992g.put(Integer.valueOf(g10.f6902a), g10);
                    continue;
                }
            }
        } catch (IOException e6) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e6);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e10);
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
        throw new UnsupportedOperationException("Method not decompiled: i5.q.k(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
