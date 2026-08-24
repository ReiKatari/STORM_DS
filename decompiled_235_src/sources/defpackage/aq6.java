package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aq6  reason: default package */
/* loaded from: classes.dex */
public final class aq6 {
    public int a;
    public s35 b;
    public int[][] c;
    public s35[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Type inference failed for: r3v5, types: [s35, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        yp6 yp6Var;
        int attributeCount;
        int i;
        int i2;
        int[][] iArr;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr2 = a75.B;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr2);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                        }
                        TypedValue peekValue = obtainStyledAttributes.peekValue(0);
                        if (peekValue != null) {
                            int i3 = peekValue.type;
                            if (i3 == 5) {
                                yp6Var = new yp6(zp6.PIXELS, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()));
                            } else if (i3 == 6) {
                                yp6Var = new yp6(zp6.PERCENT, peekValue.getFraction(1.0f, 1.0f));
                            }
                            obtainStyledAttributes.recycle();
                            attributeCount = attributeSet.getAttributeCount();
                            int[] iArr3 = new int[attributeCount];
                            int i4 = 0;
                            for (i = 0; i < attributeCount; i++) {
                                int attributeNameResource = attributeSet.getAttributeNameResource(i);
                                if (attributeNameResource != R.attr.widthChange) {
                                    int i5 = i4 + 1;
                                    if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr3[i4] = attributeNameResource;
                                    i4 = i5;
                                }
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr3, i4);
                            ?? obj = new Object();
                            obj.A = yp6Var;
                            i2 = this.a;
                            if (i2 != 0 || trimStateSet.length == 0) {
                                this.b = obj;
                            }
                            iArr = this.c;
                            if (i2 >= iArr.length) {
                                int i6 = i2 + 10;
                                int[][] iArr4 = new int[i6];
                                System.arraycopy(iArr, 0, iArr4, 0, i2);
                                this.c = iArr4;
                                s35[] s35VarArr = new s35[i6];
                                System.arraycopy(this.d, 0, s35VarArr, 0, i2);
                                this.d = s35VarArr;
                            }
                            int[][] iArr5 = this.c;
                            int i7 = this.a;
                            iArr5[i7] = trimStateSet;
                            this.d[i7] = obj;
                            this.a = i7 + 1;
                        }
                        yp6Var = null;
                        obtainStyledAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr32 = new int[attributeCount];
                        int i42 = 0;
                        while (i < attributeCount) {
                        }
                        int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i42);
                        ?? obj2 = new Object();
                        obj2.A = yp6Var;
                        i2 = this.a;
                        if (i2 != 0) {
                        }
                        this.b = obj2;
                        iArr = this.c;
                        if (i2 >= iArr.length) {
                        }
                        int[][] iArr52 = this.c;
                        int i72 = this.a;
                        iArr52[i72] = trimStateSet2;
                        this.d[i72] = obj2;
                        this.a = i72 + 1;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
