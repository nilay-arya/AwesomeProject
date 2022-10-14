/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import type {Node} from 'react';
import drakeFunc from './Haptik'; 
import {SafeAreaView, StyleSheet, View, Button} from 'react-native';

/* $FlowFixMe[missing-local-annot] The type annotation(s) required by Flow's
 * LTI update could not be added via codemod */

const App: () => Node = () => {
  const backgroundStyle = {
    backgroundColor: 'white',
  };

  return (
    <SafeAreaView style={backgroundStyle}>
      <View style={styles.buttonContainer}>
        <Button onPress={() => drakeFunc()} title="Start native activity" />
      </View>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  buttonContainer: {
    height: '100%',
    width: '50%',
    justifyContent: 'space-between',
    alignSelf: 'center',
    marginTop: '50%',
  },
});

export default App;
