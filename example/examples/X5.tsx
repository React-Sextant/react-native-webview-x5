import React, {Component} from 'react';
import {View} from 'react-native';
import WebView from '@falconia/react-native-webview-x5';

export default class X5 extends Component {
    render() {
      return (
        <View>
            <View style={{ width: '100%', height: '100%' }}>
                <WebView source={{ uri: 'http://debugtbs.qq.com/' }} />
          </View>
        </View>
      );
    }
  }
