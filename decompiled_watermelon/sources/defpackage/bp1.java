package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bp1  reason: default package */
/* loaded from: classes.dex */
public final class bp1 extends l {
    public final TextView u;
    public final vo1 v;
    public boolean w = true;

    public bp1(TextView textView) {
        this.u = textView;
        this.v = new vo1(textView);
    }

    @Override // defpackage.l
    public final InputFilter[] E(InputFilter[] inputFilterArr) {
        if (!this.w) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof vo1) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            vo1 vo1Var = this.v;
            if (i4 < length2) {
                if (inputFilterArr[i4] == vo1Var) {
                    return inputFilterArr;
                }
                i4++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = vo1Var;
                return inputFilterArr3;
            }
        }
    }

    @Override // defpackage.l
    public final boolean G() {
        return this.w;
    }

    @Override // defpackage.l
    public final void R(boolean z) {
        if (z) {
            TextView textView = this.u;
            textView.setTransformationMethod(W(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.l
    public final void S(boolean z) {
        this.w = z;
        TextView textView = this.u;
        textView.setTransformationMethod(W(textView.getTransformationMethod()));
        textView.setFilters(E(textView.getFilters()));
    }

    @Override // defpackage.l
    public final TransformationMethod W(TransformationMethod transformationMethod) {
        if (this.w) {
            if (transformationMethod instanceof fp1) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new fp1(transformationMethod);
        } else if (transformationMethod instanceof fp1) {
            return ((fp1) transformationMethod).A;
        } else {
            return transformationMethod;
        }
    }
}
